SUMMARY = "SOCKS proxy connector for aiohttp"
DESCRIPTION = "SOCKS proxy connector for aiohttp"
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "python311-aiohttp-socks-0.8.0-1.2.noarch.rpm"
RPM_HASH = "2e4fd62104b3aea1d12ed86b02daa148ae0ba6faa26c3a319b94908240c13deab5ea8cdf65fb8bdef6044a4cb195346641a6cc289158acd83fb2295b619067d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aiohttp-socks) \
python311-aiohttp-socks \
python3dist(aiohttp-socks)"
RDEPENDS:${PN} += "python(abi) \
python311-aiohttp \
python311-attrs \
python311-python-socks"

inherit rpm
