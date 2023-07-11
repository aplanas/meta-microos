SUMMARY = "Google Cloud API client core library"
DESCRIPTION = "Core Helpers for Google Cloud Python Client Library \
This library is not meant to stand-alone. Instead it defines \
common helpers (e.g. base ``Client`` classes) used by all of the \
``google-cloud-*`` packages."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "python311-google-cloud-core-2.3.2-1.5.noarch.rpm"
RPM_HASH = "120859772a0016a7341f079eadf0d69c90d39c0cb5d2def354566ac91bd94160043c9e4b22fc29f9024eccb73d0ae7d40dd796d9e3547dcdd1894bf52805a40b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-core \
python3.11dist-google-cloud-core \
python311-google-cloud-core \
python3dist-google-cloud-core"

RDEPENDS:${PN} += "python-abi \
python311-google-api-core \
python311-google-auth \
python311-six"

inherit rpm
