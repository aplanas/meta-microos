SUMMARY = "Provides a REST client targeted at Orthanc REST API endpoints"
DESCRIPTION = "python-beren provides a REST client targeted at Orthanc REST API endpoints"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python39-beren-0.7.1-3.8.aarch64.rpm"
RPM_HASH = "2a1fa4befeb4a9f64b4efa54258ab024052563d62b98866b3f74d979e61f6f9f9493f956f6298bc292fd26e4d99e9b862f8d85acb89c1e514a856cef92b3b1a4"

RPROVIDES:${PN} += "python3.9dist-beren \
python39-beren \
python3dist-beren"

RDEPENDS:${PN} += "python-abi \
python39-apiron"

inherit rpm
