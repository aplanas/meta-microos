SUMMARY = "Sphinx extension to support coroutines in markup"
DESCRIPTION = "Sphinx extension for adding asyncio-specific markups"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python311-sphinxcontrib-asyncio-0.3.0-3.6.noarch.rpm"
RPM_HASH = "473241b4fcb8697d184bf6e376762f566d7124a3c4ea99b7cadcf89aa67135f475cfdb47c5cad94a9f24068530776bf7f8d7e99137386b06ed31bf1ee8a702e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinxcontrib-asyncio \
python311-sphinxcontrib-asyncio \
python3dist-sphinxcontrib-asyncio"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
