SUMMARY = "SOCKS proxy connector for aiohttp"
DESCRIPTION = "SOCKS proxy connector for aiohttp"
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "python39-aiohttp-socks-0.8.0-2.1.noarch.rpm"
RPM_HASH = "7a525d2ecb21b9c0d6a53441d35263d19808bb721af1859d3b82db603cb1ebbfe4a51b072ac72238e9a87218a99bb18b2382fa53e26c1bc2b3b367acad8569a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiohttp-socks \
python39-aiohttp-socks \
python3dist-aiohttp-socks"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-attrs \
python39-python-socks"

inherit rpm
