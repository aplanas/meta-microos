SUMMARY = "Caching library for Python requests"
DESCRIPTION = "CacheControl is a port of the caching algorithms in httplib2 for use with \
requests session object."
LICENSE = "Apache-2.0"

PV = "0.12.11"

RPM_NAME = "python39-CacheControl-0.12.11-3.1.noarch.rpm"
RPM_HASH = "b298b0f1db96e1719319962e50d06e7de9306fca9ffefe93bb89b8142ec51c96e4d08f77f0dda9f7f77379c8a7f211991301995358f575aa9a9540fda542acaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cachecontrol \
python39-CacheControl \
python39-cachecontrol \
python3dist-cachecontrol"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-msgpack \
python39-requests \
update-alternatives"

inherit rpm
