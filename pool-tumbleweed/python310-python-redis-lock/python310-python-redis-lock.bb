SUMMARY = "Lock context manager implemented via redis SETNX/BLPOP"
DESCRIPTION = "Lock context manager implemented via redis SETNX/BLPOP."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python310-python-redis-lock-3.7.0-1.3.noarch.rpm"
RPM_HASH = "3728f77150b4dab97254f8ee72d31ddb48812495b2f03e0770dde4207200dc3ceffcc7cf552986fe71161877ef7036f0a68a263ee998e37a4aad3037d85b2a65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-redis-lock \
python3.10dist-python-redis-lock \
python310-python-redis-lock \
python3dist-python-redis-lock"

RDEPENDS:${PN} += "python-abi \
python310-redis"

inherit rpm
