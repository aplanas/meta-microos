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

RPM_NAME = "python39-requests-cache-1.0.1-1.3.noarch.rpm"
RPM_HASH = "f5e6ccab723a635ba8c2f65cbd00c7384b87eeac7d562996abfc31f5de648363603cfb214a858d6ac6993470da56529e748203c3a2b2ab04cc6add97c92e4799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-cache \
python39-requests-cache \
python3dist-requests-cache"

RDEPENDS:${PN} += "python-abi \
python39-itsdangerous \
python39-requests \
python39-url-normalize"

inherit rpm
