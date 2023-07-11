SUMMARY = "Run each test in a forked subprocess"
DESCRIPTION = "Extraction of pytest-xdist --forked module used for running tests in forked subprocess"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-pytest-forked-1.6.0-2.3.noarch.rpm"
RPM_HASH = "f3b550327c71939a2938f9b11d0372f6c49ce89c843a63e2e5b876f8ae85f9872eb98b34f54209b4c466b2e0349cd252a5ecbbd41b9643b32c38dd3ec0ba196c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-forked \
python310-pytest-forked \
python3dist-pytest-forked"

RDEPENDS:${PN} += "python-abi \
python310-py \
python310-pytest"

inherit rpm
