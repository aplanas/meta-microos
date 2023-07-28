SUMMARY = "Google Cloud API client core library"
DESCRIPTION = "Core Helpers for Google Cloud Python Client Library \
This library is not meant to stand-alone. Instead it defines \
common helpers (e.g. base ``Client`` classes) used by all of the \
``google-cloud-*`` packages."
LICENSE = "Apache-2.0"

PV = "2.3.3"

RPM_NAME = "python310-google-cloud-core-2.3.3-1.1.noarch.rpm"
RPM_HASH = "73d2a4de1b2293c1b1341a37e9c7bec1079f8cbefda6d0fbd6f866a1124d5e285562ad912688ec2fae5d0587f75190e80a618dcdaef67529c177c8e99bb9e3f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-cloud-core \
python310-google-cloud-core \
python3dist-google-cloud-core"

RDEPENDS:${PN} += "python-abi \
python310-google-api-core \
python310-google-auth \
python310-six"

inherit rpm
