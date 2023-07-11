SUMMARY = "Lock context manager implemented via redis SETNX/BLPOP"
DESCRIPTION = "Lock context manager implemented via redis SETNX/BLPOP."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python310-python-redis-lock-3.7.0-1.5.noarch.rpm"
RPM_HASH = "4fc7e42ca1fe45dd47198ba5db918eae5c5378fc0d6b682b930f2507708b533beccb201bce3b8076925c974c39f0dc8c5f298dcb617280c420a4b9e6240272c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-redis-lock \
python310-python-redis-lock \
python3dist-python-redis-lock"

RDEPENDS:${PN} += "python-abi \
python310-redis"

inherit rpm
