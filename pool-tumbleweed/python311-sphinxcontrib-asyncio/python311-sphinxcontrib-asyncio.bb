SUMMARY = "Sphinx extension to support coroutines in markup"
DESCRIPTION = "Sphinx extension for adding asyncio-specific markups"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python311-sphinxcontrib-asyncio-0.3.0-3.8.noarch.rpm"
RPM_HASH = "b44a44c12e8a504ffd3020320cfe350579554e5172dc82c55cbe3b729fa3cc3e03b2f8dacb584e5a2a962c0ad578ea36460db9abbf0f40edbeae832ff3971a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-asyncio \
python3.11dist-sphinxcontrib-asyncio \
python311-sphinxcontrib-asyncio \
python3dist-sphinxcontrib-asyncio"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
