SUMMARY = "Caching library for Python requests"
DESCRIPTION = "CacheControl is a port of the caching algorithms in httplib2 for use with \
requests session object."
LICENSE = "Apache-2.0"

PV = "0.12.11"

RPM_NAME = "python310-CacheControl-0.12.11-3.1.noarch.rpm"
RPM_HASH = "d551c09a0e4149c478810e6627352c9840da461b3a5d619fea5ffad9e00133ddb255e349c4a32aef8981ad0bbcbf16f6ceaf3ea0547bd87c2b7a23d6557f8ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CacheControl \
python3-cachecontrol \
python3.10dist(cachecontrol) \
python310-CacheControl \
python310-cachecontrol \
python3dist(cachecontrol)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-msgpack \
python310-requests \
update-alternatives"

inherit rpm
