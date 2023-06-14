SUMMARY = "Lock context manager implemented via redis SETNX/BLPOP"
DESCRIPTION = "Lock context manager implemented via redis SETNX/BLPOP."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "python311-python-redis-lock-3.7.0-1.3.noarch.rpm"
RPM_HASH = "1f2d528c3d9b227a344219361b3513787e0f427e5c02d38f2e0d6733e941051e85b748d8562f5b91cbd55452716b73544b7e40e9af4827327d3118f16bbce763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-redis-lock \
python311-python-redis-lock \
python3dist-python-redis-lock"

RDEPENDS:${PN} += "python-abi \
python311-redis"

inherit rpm
