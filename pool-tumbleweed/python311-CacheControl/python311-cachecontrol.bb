SUMMARY = "Caching library for Python requests"
DESCRIPTION = "CacheControl is a port of the caching algorithms in httplib2 for use with \
requests session object."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python311-CacheControl-0.13.1-1.1.noarch.rpm"
RPM_HASH = "cd7c0aea88778bc2675ed92fcd524366ce85c40b09a144ce9f82f52b0e0f93c2d5dc0b1d84c169eaa389c0b4a63e247f1d6437174a96f4f1f1a7869be9ad0f5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CacheControl \
python3-cachecontrol \
python3.11dist-cachecontrol \
python311-CacheControl \
python311-cachecontrol \
python3dist-cachecontrol"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-msgpack \
python311-requests \
update-alternatives"

inherit rpm
