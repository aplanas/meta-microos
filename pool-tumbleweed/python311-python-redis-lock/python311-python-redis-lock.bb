SUMMARY = "Lock context manager implemented via redis SETNX/BLPOP"
DESCRIPTION = "Lock context manager implemented via redis SETNX/BLPOP."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python311-python-redis-lock-3.7.0-1.5.noarch.rpm"
RPM_HASH = "efcee5f6dcbbaf298b320c69e5209c656fd4ec7a6c15f9c540e2a1d06cd9015bab3c704c96b3787c797d9acd6cfcc2c0dbdf74183a43deb3ffaa4f753497ec6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-redis-lock \
python3.11dist-python-redis-lock \
python311-python-redis-lock \
python3dist-python-redis-lock"

RDEPENDS:${PN} += "python-abi \
python311-redis"

inherit rpm
