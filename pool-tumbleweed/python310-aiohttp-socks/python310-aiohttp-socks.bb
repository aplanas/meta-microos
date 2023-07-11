SUMMARY = "SOCKS proxy connector for aiohttp"
DESCRIPTION = "SOCKS proxy connector for aiohttp"
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "python310-aiohttp-socks-0.8.0-2.1.noarch.rpm"
RPM_HASH = "43bf7cb9e43e9c9c6fb43f2189538c45efa5a979fa891f7d916d47033342966fdd6f69458898698cebce7fa32bfdca31cc8bb2144c893c8ded4cb11178145139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiohttp-socks \
python310-aiohttp-socks \
python3dist-aiohttp-socks"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp \
python310-attrs \
python310-python-socks"

inherit rpm
