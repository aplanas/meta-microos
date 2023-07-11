SUMMARY = "Sphinx extension to support coroutines in markup"
DESCRIPTION = "Sphinx extension for adding asyncio-specific markups"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python39-sphinxcontrib-asyncio-0.3.0-3.8.noarch.rpm"
RPM_HASH = "9c408bc5b1979f436f9a0962c7d9b1300a52eb45597e52dcba91d9bb85afc9ced7ca498c35f2396702f5462d935282867b114325f95d925aed9b0edfbc3ef780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-asyncio \
python39-sphinxcontrib-asyncio \
python3dist-sphinxcontrib-asyncio"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
