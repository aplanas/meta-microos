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

RPM_NAME = "python311-requests-cache-1.0.1-1.1.noarch.rpm"
RPM_HASH = "a9ea9b0c21a9f79e591ae221bc5f2efc0b7e022fa18fc3f713e9baa9149855b8a42d154e45e70390936690d441618076444e1532d1ce11421b46bf4622cadfdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-requests-cache \
python311-requests-cache \
python3dist-requests-cache"

RDEPENDS:${PN} += "python-abi \
python311-itsdangerous \
python311-requests \
python311-url-normalize"

inherit rpm
