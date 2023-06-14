SUMMARY = "Google Cloud API client core library"
DESCRIPTION = "Core Helpers for Google Cloud Python Client Library \
This library is not meant to stand-alone. Instead it defines \
common helpers (e.g. base ``Client`` classes) used by all of the \
``google-cloud-*`` packages."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "python310-google-cloud-core-2.3.2-1.3.noarch.rpm"
RPM_HASH = "763075d0f24c251e346bc11c9f4e369e3a2fe61ad63f9bbf940e3e9d13cc096ed78e9c161d9e910ca85b5ae255d7f7b52e51d6d1cd5787960955cbc0696311c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-core \
python3.10dist-google-cloud-core \
python310-google-cloud-core \
python3dist-google-cloud-core"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-google-auth \
python310-six"

inherit rpm
