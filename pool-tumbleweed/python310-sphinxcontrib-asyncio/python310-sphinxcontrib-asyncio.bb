SUMMARY = "Sphinx extension to support coroutines in markup"
DESCRIPTION = "Sphinx extension for adding asyncio-specific markups"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python310-sphinxcontrib-asyncio-0.3.0-3.8.noarch.rpm"
RPM_HASH = "cf7103187e2e433f2fc2dfead3a5274563421462bbca88dffa8883e1db8b3ab55f4fc9de27beffe9cd45a0016f8e22cead84cb2d43233a79bce1c2bf440473ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-asyncio \
python310-sphinxcontrib-asyncio \
python3dist-sphinxcontrib-asyncio"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
