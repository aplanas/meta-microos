SUMMARY = "Atomic transactions for TinyDB"
DESCRIPTION = "Atomic transactions for TinyDB."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-tinyrecord-0.2.0-2.7.noarch.rpm"
RPM_HASH = "bf97136cd8e7448291a99439f739e361db9f40babdcce2d41b8a48d96e3df6ca2f0446f2739d64a0524f40fd75475e36733c3bf64e38e66af4f68aec758f6feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinyrecord \
python3.10dist(tinyrecord) \
python310-tinyrecord \
python3dist(tinyrecord)"
RDEPENDS:${PN} += "python(abi) \
python310-tinydb"

inherit rpm
