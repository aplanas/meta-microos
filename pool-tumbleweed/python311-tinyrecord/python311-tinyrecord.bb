SUMMARY = "Atomic transactions for TinyDB"
DESCRIPTION = "Atomic transactions for TinyDB."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-tinyrecord-0.2.0-2.7.noarch.rpm"
RPM_HASH = "a323d515f3b9f4b5fd96f6e1f46ce7fe7d2c96f413765257e175c40c4cc0bf6e4892fd0710e656871bff30b8de46ad1e91f78a5b206f4b33e6956414fdb3863b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tinyrecord) \
python311-tinyrecord \
python3dist(tinyrecord)"

RDEPENDS:${PN} += "python(abi) \
python311-tinydb"

inherit rpm
