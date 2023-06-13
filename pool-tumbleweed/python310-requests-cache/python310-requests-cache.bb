SUMMARY = "Persistent cache for requests library"
DESCRIPTION = "Requests-cache is a transparent persistent cache for requests_ library. \
 \
It can be useful when you are creating some simple data scraper with constantly \
changing parsing logic or data format, and don't want to redownload pages or \
write complex error handling and persistence. \
 \
Requests-cache ignores all cache headers, it just caches the data for the \
time you specify. \
 \
If you need library which knows how to use HTTP headers and status codes, \
take a look at `CacheControl <https://github.com/ionrock/cachecontrol>`_."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "python310-requests-cache-1.0.1-1.1.noarch.rpm"
RPM_HASH = "9d52348961ee5a0a8f8de3ab981a88eefbd95507ccd8f0aaa29f5806b56294098dbd5323572f44b1e5075d6e6c0144d4ef6e4d78feff0e3dfb086f684dc2e23f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-cache \
python3.10dist(requests-cache) \
python310-requests-cache \
python3dist(requests-cache)"

RDEPENDS:${PN} += "python(abi) \
python310-itsdangerous \
python310-requests \
python310-url-normalize"

inherit rpm
