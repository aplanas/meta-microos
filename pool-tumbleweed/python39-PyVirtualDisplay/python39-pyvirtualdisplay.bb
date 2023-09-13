SUMMARY = "Python wrapper for Xvfb, Xephyr and Xvnc"
DESCRIPTION = "PyVirtualDisplay is a python wrapper for Xvfb, Xephyr and Xvnc."
LICENSE = "BSD-2-Clause"

PV = "3.0"

RPM_NAME = "python39-PyVirtualDisplay-3.0-4.1.noarch.rpm"
RPM_HASH = "6b56f45c138d6ec3c5334c18560b4931f20748e57845b43cfc39bf91f63a57766e1adfbfec82ede6617cb0a2cc36b9d37ae51b7194abaf4f55d0adcc050a090a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyvirtualdisplay \
python39-PyVirtualDisplay \
python3dist-pyvirtualdisplay"

RDEPENDS:${PN} += "python-abi \
python39-EasyProcess \
xorg-x11-Xvfb"

inherit rpm
