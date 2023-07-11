SUMMARY = "Google Cloud API client core library"
DESCRIPTION = "Core Helpers for Google Cloud Python Client Library \
This library is not meant to stand-alone. Instead it defines \
common helpers (e.g. base ``Client`` classes) used by all of the \
``google-cloud-*`` packages."
LICENSE = "Apache-2.0"

PV = "2.3.2"

RPM_NAME = "python39-google-cloud-core-2.3.2-1.5.noarch.rpm"
RPM_HASH = "91334199f4597ad65a3d56271c5588bf325c2eee11062e8f24a8dc270981b98e6f4af4d57012c1c8172d3fee9ebb042dd7578dbfe986c26ac61863c651fcb484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-cloud-core \
python39-google-cloud-core \
python3dist-google-cloud-core"

RDEPENDS:${PN} += "python-abi \
python39-google-api-core \
python39-google-auth \
python39-six"

inherit rpm
