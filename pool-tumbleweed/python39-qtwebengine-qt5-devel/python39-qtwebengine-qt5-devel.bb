SUMMARY = "Development files for python39-qtwebengine-qt5"
DESCRIPTION = "This package provides the framework API files for the Eric IDE. \
and  the SIP files used to generate the Python bindings for python39-qtwebengine-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtwebengine-qt5-devel-5.15.6-1.7.aarch64.rpm"
RPM_HASH = "f3609405c738f36600fbb71536059e16c04f2df247cb2141087f39e68b6a3b7111429866e2cae8c5fc7287f477c9da71748697beeb402d6e3359a3c5731115d9"

RPROVIDES:${PN} += "python-qtwebengine-qt5-sip \
python39-qtwebengine-qt5-api \
python39-qtwebengine-qt5-devel \
python39-qtwebengine-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python39-qt5-devel"

inherit rpm
