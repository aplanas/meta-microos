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

RPM_NAME = "python39-requests-cache-1.0.1-1.1.noarch.rpm"
RPM_HASH = "1e206372ae75c18eb3969f86766e85bee021a3ab35fe1b2cadf1918c79d28d135d0ac33b2bc2c32ef261c7aefc5760e07a5a1ec5548a1675a40e32af3d066600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-cache) \
python39-requests-cache \
python3dist(requests-cache)"

RDEPENDS:${PN} += "python(abi) \
python39-itsdangerous \
python39-requests \
python39-url-normalize"

inherit rpm
