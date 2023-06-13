SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "This package supplies third-party access to the functionality of \
importlib.metadata including improvements added to subsequent Python versions."
LICENSE = "Apache-2.0"

PV = "6.6.0"

RPM_NAME = "python310-importlib-metadata-6.6.0-1.1.noarch.rpm"
RPM_HASH = "6b61d8b22e61c7bce1bb6510cbb386fac01a902aefca3ea1fd75a55f4807cf32f37c3cf8707793957069fac5b901c10f662a57e97c5a33481fb1d8b54ca3c838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-importlib-metadata \
python3-importlib_metadata \
python3.10dist(importlib-metadata) \
python310-importlib-metadata \
python310-importlib_metadata \
python3dist(importlib-metadata)"

RDEPENDS:${PN} += "python(abi) \
python310-zipp"

inherit rpm
