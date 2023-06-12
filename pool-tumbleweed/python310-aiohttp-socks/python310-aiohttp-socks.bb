SUMMARY = "SOCKS proxy connector for aiohttp"
DESCRIPTION = "SOCKS proxy connector for aiohttp"
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "python310-aiohttp-socks-0.8.0-1.2.noarch.rpm"
RPM_HASH = "9bb54b51375d572c24b2a975dc383e4c921b21759bbe964213cd1bedaac0c24b8af21ea53638ea25847933094237b4c0275a4ae04eeb3939c30b82a993487d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-socks \
python3.10dist(aiohttp-socks) \
python310-aiohttp-socks \
python3dist(aiohttp-socks)"
RDEPENDS:${PN} += "python(abi) \
python310-aiohttp \
python310-attrs \
python310-python-socks"

inherit rpm
