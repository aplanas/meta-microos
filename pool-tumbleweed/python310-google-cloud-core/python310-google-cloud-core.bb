SUMMARY = "Google Cloud API client core library"
DESCRIPTION = "Core Helpers for Google Cloud Python Client Library \
This library is not meant to stand-alone. Instead it defines \
common helpers (e.g. base ``Client`` classes) used by all of the \
``google-cloud-*`` packages."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "python310-google-cloud-core-2.3.2-1.5.noarch.rpm"
RPM_HASH = "ce1922025201e2264838b1901d34837adeb81beb63f848e9c1427fab239046f163128606a7ffe88ad0d1f7b382bfc29a51c35793f950b5a0a1304b1d6b8ee38d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-cloud-core \
python310-google-cloud-core \
python3dist-google-cloud-core"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-google-auth \
python310-six"

inherit rpm
