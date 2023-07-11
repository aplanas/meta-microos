SUMMARY = "Development files for python311-qt3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and the Qt5 3D framework API files for the Eric IDE for python311-qt3d-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qt3d-qt5-devel-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "8c43d160b74bcd4b8ead28c87aee15d15d9fad4e4b9c25d025956835d33b61c2a5d00ad130f60216cf59c598230dbc87edbcb7f1b2aa3bbe13485f8575f2cd4c"

RPROVIDES:${PN} += "python-qt3d-qt5-api \
python-qt3d-qt5-sip \
python3-qt3d-qt5-api \
python3-qt3d-qt5-devel \
python3-qt3d-qt5-sip \
python311-qt3d-qt5-api \
python311-qt3d-qt5-devel \
python311-qt3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python311-qt5-devel"

inherit rpm
