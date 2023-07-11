SUMMARY = "Python wrapper for Xvfb, Xephyr and Xvnc"
DESCRIPTION = "PyVirtualDisplay is a python wrapper for Xvfb, Xephyr and Xvnc."
LICENSE = "BSD-2-Clause"

PV = "3.0"

RPM_NAME = "python310-PyVirtualDisplay-3.0-3.2.noarch.rpm"
RPM_HASH = "c6fefb9ca6071ff68a28d21302c98e9965e8722f6181213724081f45802e3a3033afef9b1f7f6591939a81a4d776d03985bdb4ecc56fa473c7077f49f9b363e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyvirtualdisplay \
python310-PyVirtualDisplay \
python3dist-pyvirtualdisplay"

RDEPENDS:${PN} += "python-abi \
python310-EasyProcess \
xorg-x11-Xvfb"

inherit rpm
