SUMMARY = "Sphinx extension to support coroutines in markup"
DESCRIPTION = "Sphinx extension for adding asyncio-specific markups"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python310-sphinxcontrib-asyncio-0.3.0-3.6.noarch.rpm"
RPM_HASH = "006abfa799eee1c09e27f8b7036cc44c79746dfa39d53b45fdc1495871df3fed6a692b0d8e79ef37a3c6e317cdf671d964249c5fe3352bd7dd5fcf9c2aa3d8e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-asyncio \
python3.10dist-sphinxcontrib-asyncio \
python310-sphinxcontrib-asyncio \
python3dist-sphinxcontrib-asyncio"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
