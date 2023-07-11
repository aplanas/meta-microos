SUMMARY = "Python wrapper for Xvfb, Xephyr and Xvnc"
DESCRIPTION = "PyVirtualDisplay is a python wrapper for Xvfb, Xephyr and Xvnc."
LICENSE = "BSD-2-Clause"

PV = "3.0"

RPM_NAME = "python39-PyVirtualDisplay-3.0-3.2.noarch.rpm"
RPM_HASH = "17ad27eeb41888bf8ceb1d7010dbb7ba33a1e98f58f5fd922f5da67ccf7634859637b9d0a3ad496f746ab3a2d32c6b2939a800aa61fd26265e53133961338de9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyvirtualdisplay \
python39-PyVirtualDisplay \
python3dist-pyvirtualdisplay"

RDEPENDS:${PN} += "python-abi \
python39-EasyProcess \
xorg-x11-Xvfb"

inherit rpm
