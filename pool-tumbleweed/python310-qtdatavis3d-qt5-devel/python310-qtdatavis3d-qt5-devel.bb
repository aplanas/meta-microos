SUMMARY = "Sip and eric API files for python310-qtdatavis3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and Qt5 Data Visualization library API files for the Eric IDE for python310-qtdatavis3d-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python310-qtdatavis3d-qt5-devel-5.15.5-1.6.aarch64.rpm"
RPM_HASH = "987245d87e77e3b285bf7284e8e96548fd0587301980b400a1d28f52bdcc796946934a265745b42b1237ab1fd6650d963e212a4f3e110ad51ee533ec97d30cad"

RPROVIDES:${PN} += "python-qtdatavis3d-qt5-api \
python-qtdatavis3d-qt5-sip \
python310-qtdatavis3d-qt5-api \
python310-qtdatavis3d-qt5-devel \
python310-qtdatavis3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python310-qt5-devel"

inherit rpm
