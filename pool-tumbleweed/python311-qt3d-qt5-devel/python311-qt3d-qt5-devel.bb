SUMMARY = "Development files for python311-qt3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and the Qt5 3D framework API files for the Eric IDE for python311-qt3d-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qt3d-qt5-devel-5.15.6-1.6.aarch64.rpm"
RPM_HASH = "69a6558d2a6e8795341e2cbd4afc9f47b1e4721e9c977ca1f5b8e5d5c76003889a88df35a4e7765d72be35f02e84560e37fead448827322ef7da375c116eb689"

RPROVIDES:${PN} += "python-qt3d-qt5-api \
python-qt3d-qt5-sip \
python311-qt3d-qt5-api \
python311-qt3d-qt5-devel \
python311-qt3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python311-qt5-devel"

inherit rpm
