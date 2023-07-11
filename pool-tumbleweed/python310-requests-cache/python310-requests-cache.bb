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

RPM_NAME = "python310-requests-cache-1.0.1-1.3.noarch.rpm"
RPM_HASH = "0e1c35963f793801089d64d70966ca860c01b62f58d0717e6029dc694f89c1775dd0c345b6c5feb230cebdb4c78b7814499a2358b159d8488b1bcb23eea5ab22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-cache \
python310-requests-cache \
python3dist-requests-cache"

RDEPENDS:${PN} += "python-abi \
python310-itsdangerous \
python310-requests \
python310-url-normalize"

inherit rpm
