SUMMARY = "Google Cloud API client core library"
DESCRIPTION = "Core Helpers for Google Cloud Python Client Library \
This library is not meant to stand-alone. Instead it defines \
common helpers (e.g. base ``Client`` classes) used by all of the \
``google-cloud-*`` packages."
LICENSE = "Apache-2.0"

PV = "2.3.3"

RPM_NAME = "python311-google-cloud-core-2.3.3-1.1.noarch.rpm"
RPM_HASH = "619aef265349e4451b969f8a756469ce1340f82b8ed5b81af94c20f4c7bdfa786d9e3451cf65c57efb8ed6f99e2e7728df7546babd66cc1d443e9bf86d3eaac5"
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
