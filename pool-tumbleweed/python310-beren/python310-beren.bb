SUMMARY = "Provides a REST client targeted at Orthanc REST API endpoints"
DESCRIPTION = "python-beren provides a REST client targeted at Orthanc REST API endpoints"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python310-beren-0.7.1-3.6.aarch64.rpm"
RPM_HASH = "404e6c7e6009fcd10e9b7ef8c79ef01115140625182f845259a286ef14a753a210ba923807efca9d61502fe9c65a2745b64db7ee17ae2a80871f17f03437d37d"

RPROVIDES:${PN} += "python3-beren \
python3.10dist(beren) \
python310-beren \
python310-beren(aarch-64) \
python3dist(beren)"

RDEPENDS:${PN} += "python(abi) \
python310-apiron"

inherit rpm
