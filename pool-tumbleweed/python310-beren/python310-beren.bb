SUMMARY = "Provides a REST client targeted at Orthanc REST API endpoints"
DESCRIPTION = "python-beren provides a REST client targeted at Orthanc REST API endpoints"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python310-beren-0.7.1-3.8.aarch64.rpm"
RPM_HASH = "4e0de5b61a63951935741116d382bb3949580f8aec97df8ef3fa68b582084dee059f9ba64547442a28592be9c23b07467fc4eb4b3fe4959162fd1b88b78358ab"

RPROVIDES:${PN} += "python3.10dist-beren \
python310-beren \
python3dist-beren"

RDEPENDS:${PN} += "python-abi \
python310-apiron"

inherit rpm
