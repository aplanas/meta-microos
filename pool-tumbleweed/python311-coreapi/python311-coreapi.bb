SUMMARY = "Python client library for Core API"
DESCRIPTION = "Python client library for Core API, a format-independent Document Object Model \
for representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "2.3.3"

RPM_NAME = "python311-coreapi-2.3.3-2.1.noarch.rpm"
RPM_HASH = "2321f602c8278fb5e1f85bc0bd65a1c66cb8a4e8635a30d9962b820d7e191d71537742e5dd354b36fbaef8a990db62e32dfaf63d2bd174f3b6256c4364b19bb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coreapi \
python3.11dist-coreapi \
python311-coreapi \
python3dist-coreapi"

RDEPENDS:${PN} += "python-abi \
python311-coreschema \
python311-itypes \
python311-requests \
python311-uritemplate"

inherit rpm
