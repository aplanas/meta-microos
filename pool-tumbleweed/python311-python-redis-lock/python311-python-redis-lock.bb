SUMMARY = "Lock context manager implemented via redis SETNX/BLPOP"
DESCRIPTION = "Lock context manager implemented via redis SETNX/BLPOP."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python311-python-redis-lock-4.0.0-1.1.noarch.rpm"
RPM_HASH = "e01caf6dd219e12432d3fee7311bf27370d78c515cdb3496ffe9ec153449e9502d1323d2c3699e7e5301d8b10d358ff6fc85acd3185423e5ba24a8903b8b575c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-redis-lock \
python3.11dist-python-redis-lock \
python311-python-redis-lock \
python3dist-python-redis-lock"

RDEPENDS:${PN} += "python-abi \
python311-redis"

inherit rpm
