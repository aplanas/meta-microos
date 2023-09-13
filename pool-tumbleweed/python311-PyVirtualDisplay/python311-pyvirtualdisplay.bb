SUMMARY = "Python wrapper for Xvfb, Xephyr and Xvnc"
DESCRIPTION = "PyVirtualDisplay is a python wrapper for Xvfb, Xephyr and Xvnc."
LICENSE = "BSD-2-Clause"

PV = "3.0"

RPM_NAME = "python311-PyVirtualDisplay-3.0-4.1.noarch.rpm"
RPM_HASH = "52d0a1ef31c6de649ec25def4a926d7f5859260a31a5fd5fe0bb79ca512f9da473f22269f0f078ec4aa24ed04ae5e521a0ddfce4d5d5fae8607b72adea727b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyVirtualDisplay \
python3.11dist-pyvirtualdisplay \
python311-PyVirtualDisplay \
python3dist-pyvirtualdisplay"

RDEPENDS:${PN} += "python-abi \
python311-EasyProcess \
xorg-x11-Xvfb"

inherit rpm
