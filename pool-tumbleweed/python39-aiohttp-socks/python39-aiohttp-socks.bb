SUMMARY = "SOCKS proxy connector for aiohttp"
DESCRIPTION = "SOCKS proxy connector for aiohttp"
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "python39-aiohttp-socks-0.8.0-1.2.noarch.rpm"
RPM_HASH = "118e2abde7c8c8a5ece8950bb52b9a0c3c66c3e1e7c5c93af10becededaf6e385326ca420af3b17cc655cc4dc5d5863c0a429643c8313a3e5e4e176ee7678710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiohttp-socks) \
python39-aiohttp-socks \
python3dist(aiohttp-socks)"
RDEPENDS:${PN} += "python(abi) \
python39-aiohttp \
python39-attrs \
python39-python-socks"

inherit rpm
