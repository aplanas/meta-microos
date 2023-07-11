SUMMARY = "Caching library for Python requests"
DESCRIPTION = "CacheControl is a port of the caching algorithms in httplib2 for use with \
requests session object."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python310-CacheControl-0.13.1-1.1.noarch.rpm"
RPM_HASH = "6beff5fd9565704dcdbf68d109a8c454434c530e5226ec36244f2702679bceceb55dc291bfc31dfc760a438b6270b241b6c81a866bf0ccb99e98908038e394ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cachecontrol \
python310-CacheControl \
python310-cachecontrol \
python3dist-cachecontrol"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-msgpack \
python310-requests \
update-alternatives"

inherit rpm
