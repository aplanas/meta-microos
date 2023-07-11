SUMMARY = "Lock context manager implemented via redis SETNX/BLPOP"
DESCRIPTION = "Lock context manager implemented via redis SETNX/BLPOP."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python39-python-redis-lock-3.7.0-1.5.noarch.rpm"
RPM_HASH = "08c133f0ee25e9dd1538d079e6d8c66a26e962a50a01b572dfe1688fece03f240faaf9a037dee98e8648894f6ebde862bec42cd457c6ef288a14baec307cba54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-redis-lock \
python39-python-redis-lock \
python3dist-python-redis-lock"

RDEPENDS:${PN} += "python-abi \
python39-redis"

inherit rpm
