SUMMARY = "Lock context manager implemented via redis SETNX/BLPOP"
DESCRIPTION = "Lock context manager implemented via redis SETNX/BLPOP."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python310-python-redis-lock-4.0.0-1.1.noarch.rpm"
RPM_HASH = "e041a0841636a3860ffc912765a3d29a7ecd384b48a51ab79baead4230b5f107d2796126e5bbf60ba271172a2593fe93805f0683b3de9435623b55c16ca530a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-redis-lock \
python310-python-redis-lock \
python3dist-python-redis-lock"

RDEPENDS:${PN} += "python-abi \
python310-redis"

inherit rpm
