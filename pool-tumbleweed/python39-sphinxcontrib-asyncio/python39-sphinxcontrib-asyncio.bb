SUMMARY = "Sphinx extension to support coroutines in markup"
DESCRIPTION = "Sphinx extension for adding asyncio-specific markups"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python39-sphinxcontrib-asyncio-0.3.0-3.6.noarch.rpm"
RPM_HASH = "595fb01c1b280805d1f874f05b7b6fba1be1e86ba1c8ba804bc58b23528bfccf0b33fc0e7704d909edab0145f15459c185288fa07eb75048b292eaa43ec62484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-asyncio \
python39-sphinxcontrib-asyncio \
python3dist-sphinxcontrib-asyncio"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
