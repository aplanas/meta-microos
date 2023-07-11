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

RPM_NAME = "python311-requests-cache-1.0.1-1.3.noarch.rpm"
RPM_HASH = "ffade61df5a0383b687ad038e20cf3956e9b8d0c689939eeee3ed7f48ea80a438c7530616321af8eafbbdfc5ac46d137586220f3ce26528934e6bcabe3835753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-cache \
python3.11dist-requests-cache \
python311-requests-cache \
python3dist-requests-cache"

RDEPENDS:${PN} += "python-abi \
python311-itsdangerous \
python311-requests \
python311-url-normalize"

inherit rpm
