SUMMARY = "Sip and eric API files for python311-qtdatavis3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and Qt5 Data Visualization library API files for the Eric IDE for python311-qtdatavis3d-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python311-qtdatavis3d-qt5-devel-5.15.5-1.5.aarch64.rpm"
RPM_HASH = "008c519031aa4bc5a1812b137bfef0c08e8cca03c8e9f219836f4ce95a43557cb8aa9add4eba29ce2a3949606eebde6607f8b6938345f52801ad0c401a7140af"

RPROVIDES:${PN} += "python-qtdatavis3d-qt5-api \
python-qtdatavis3d-qt5-sip \
python311-qtdatavis3d-qt5-api \
python311-qtdatavis3d-qt5-devel \
python311-qtdatavis3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python311-qt5-devel"

inherit rpm
