SUMMARY = "Google Cloud API client core library"
DESCRIPTION = "Core Helpers for Google Cloud Python Client Library \
This library is not meant to stand-alone. Instead it defines \
common helpers (e.g. base ``Client`` classes) used by all of the \
``google-cloud-*`` packages."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "python311-google-cloud-core-2.3.2-1.3.noarch.rpm"
RPM_HASH = "2c252aa2a80e139f7c7fc25d2945d3107518ba210470f766a69c0fe9106aa738933e643268aaa14abd75b32ddc45c5d6ebedcd36b23d19fa4a145f5bb44fc022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-google-cloud-core \
python311-google-cloud-core \
python3dist-google-cloud-core"

RDEPENDS:${PN} += "python-abi \
python311-google-api-core \
python311-google-auth \
python311-six"

inherit rpm
