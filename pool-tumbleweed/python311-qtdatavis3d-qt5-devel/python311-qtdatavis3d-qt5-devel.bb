SUMMARY = "Sip and eric API files for python311-qtdatavis3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and Qt5 Data Visualization library API files for the Eric IDE for python311-qtdatavis3d-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python311-qtdatavis3d-qt5-devel-5.15.5-1.6.aarch64.rpm"
RPM_HASH = "29f535a4b476223a8abc9938b3672352fc7616835ee8b983f2774ea6f0b57b639975ca536a7332e0d6c33c9267b79fef38cc7bf1d32bae2f27c1e21dee30c896"

RPROVIDES:${PN} += "python-qtdatavis3d-qt5-api \
python-qtdatavis3d-qt5-sip \
python3-qtdatavis3d-qt5-api \
python3-qtdatavis3d-qt5-devel \
python3-qtdatavis3d-qt5-sip \
python311-qtdatavis3d-qt5-api \
python311-qtdatavis3d-qt5-devel \
python311-qtdatavis3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python311-qt5-devel"

inherit rpm
