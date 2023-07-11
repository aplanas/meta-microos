SUMMARY = "Development files for python39-qtwebengine-qt5"
DESCRIPTION = "This package provides the framework API files for the Eric IDE. \
and  the SIP files used to generate the Python bindings for python39-qtwebengine-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtwebengine-qt5-devel-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "f0e58a63addfa9ef2c348180da687553fff8bf719e65990d15e2f288a6b58a3bc186bf6d2c48bb079e0e7b4681d259d742c9b220d251020d6a62d73f69e8f302"

RPROVIDES:${PN} += "python-qtwebengine-qt5-sip \
python39-qtwebengine-qt5-api \
python39-qtwebengine-qt5-devel \
python39-qtwebengine-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python39-qt5-devel"

inherit rpm
