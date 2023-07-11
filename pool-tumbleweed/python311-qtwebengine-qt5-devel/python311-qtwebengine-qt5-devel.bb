SUMMARY = "Development files for python311-qtwebengine-qt5"
DESCRIPTION = "This package provides the framework API files for the Eric IDE. \
and  the SIP files used to generate the Python bindings for python311-qtwebengine-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qtwebengine-qt5-devel-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "50e68cc8409c971962f042988d0a35260abe42963f0ce33fba90aacea88c78876f7e871cc4d4e590d6a936c010b196022de384dd2c2f7f20b07c1c38cac8b7f5"

RPROVIDES:${PN} += "python-qtwebengine-qt5-sip \
python3-qtwebengine-qt5-api \
python3-qtwebengine-qt5-devel \
python3-qtwebengine-qt5-sip \
python311-qtwebengine-qt5-api \
python311-qtwebengine-qt5-devel \
python311-qtwebengine-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python311-qt5-devel"

inherit rpm
