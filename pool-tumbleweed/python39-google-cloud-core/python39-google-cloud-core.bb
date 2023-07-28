SUMMARY = "Google Cloud API client core library"
DESCRIPTION = "Core Helpers for Google Cloud Python Client Library \
This library is not meant to stand-alone. Instead it defines \
common helpers (e.g. base ``Client`` classes) used by all of the \
``google-cloud-*`` packages."
LICENSE = "Apache-2.0"

PV = "2.3.3"

RPM_NAME = "python39-google-cloud-core-2.3.3-1.1.noarch.rpm"
RPM_HASH = "0197d50fb0baf410a6f385db442fd1f176b5aebd28b41c6f19965860ee25bbce42d5a8825a5cfedaf66d476264bd574b5ffee5717931503d6f789b147923f13d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-cloud-core \
python39-google-cloud-core \
python3dist-google-cloud-core"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-google-auth \
python39-six"

inherit rpm
