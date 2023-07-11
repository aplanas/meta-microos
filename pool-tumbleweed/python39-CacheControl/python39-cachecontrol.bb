SUMMARY = "Caching library for Python requests"
DESCRIPTION = "CacheControl is a port of the caching algorithms in httplib2 for use with \
requests session object."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python39-CacheControl-0.13.1-1.1.noarch.rpm"
RPM_HASH = "ab8681a4f692254d7a7147739ea8a049f9d178e415b5f19dcd686b8ef2d37028cedf7c08efcd5bc3e39782de5514901c50566a0450fea4ebdaa9d3c0c5ac0b76"
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
