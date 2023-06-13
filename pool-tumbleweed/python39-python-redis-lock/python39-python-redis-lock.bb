SUMMARY = "Lock context manager implemented via redis SETNX/BLPOP"
DESCRIPTION = "Lock context manager implemented via redis SETNX/BLPOP."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python39-python-redis-lock-3.7.0-1.3.noarch.rpm"
RPM_HASH = "f915ce6b3f43b25d5d5ac6e974d7da466579dcd59c481a1d0c6875b0876f915781c06ad71837043bf7a4f37b7ffe785bf34b0a4298c826ac69b69a7a2ed33af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-redis-lock) \
python39-python-redis-lock \
python3dist(python-redis-lock)"

RDEPENDS:${PN} += "python(abi) \
python39-redis"

inherit rpm
