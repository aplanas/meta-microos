SUMMARY = "Development files for python310-qtwebengine-qt5"
DESCRIPTION = "This package provides the framework API files for the Eric IDE. \
and  the SIP files used to generate the Python bindings for python310-qtwebengine-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtwebengine-qt5-devel-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "a90063bf5d0aa3fcacfa6535642174047ec1e45cb988e68b906ac0f8808cc6e2276e9ebfdf8c0a5a0633bcf5f431c81fbb373479889903f336b3d1d9e7ca9a2b"

RPROVIDES:${PN} += "python-qtwebengine-qt5-sip \
python310-qtwebengine-qt5-api \
python310-qtwebengine-qt5-devel \
python310-qtwebengine-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python310-qt5-devel"

inherit rpm
