SUMMARY = "Sip and eric API files for python39-qtdatavis3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and Qt5 Data Visualization library API files for the Eric IDE for python39-qtdatavis3d-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python39-qtdatavis3d-qt5-devel-5.15.5-1.6.aarch64.rpm"
RPM_HASH = "ee890eb5fd248eeb0d66a1d3211d04a335f96a30b20d319fef611680b4716559f3e74da31176919eea5c970941ff76b25432ce3b8e65d1cdd688b677f8320e72"

RPROVIDES:${PN} += "python-qtdatavis3d-qt5-api \
python-qtdatavis3d-qt5-sip \
python39-qtdatavis3d-qt5-api \
python39-qtdatavis3d-qt5-devel \
python39-qtdatavis3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python39-qt5-devel"

inherit rpm
