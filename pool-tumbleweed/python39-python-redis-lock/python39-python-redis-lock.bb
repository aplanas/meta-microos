SUMMARY = "Lock context manager implemented via redis SETNX/BLPOP"
DESCRIPTION = "Lock context manager implemented via redis SETNX/BLPOP."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python39-python-redis-lock-4.0.0-1.1.noarch.rpm"
RPM_HASH = "d0fee97f3dbd77e6fc77862fbc7e96472ecdbdb37e212b89eed42e7bdec922d5a0eb4951f3d56566abbdcb3ed49ce4f78e856fc3d98082915be0c5efa513f8a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-redis-lock \
python39-python-redis-lock \
python3dist-python-redis-lock"

RDEPENDS:${PN} += "python-abi \
python39-redis"

inherit rpm
