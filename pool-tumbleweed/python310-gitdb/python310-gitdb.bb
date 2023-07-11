SUMMARY = "Git Object Database"
DESCRIPTION = "GitDB is a pure-Python git object database"
LICENSE = "BSD-3-Clause"

PV = "4.0.10"

RPM_NAME = "python310-gitdb-4.0.10-2.3.aarch64.rpm"
RPM_HASH = "78b463e511d1fc71f27a8693cc109b1d9a8780a7cce236c6c915e106fbf65cbc4185a9a30b79064080e13fcf1555f387431176bccd63bfb2405390949a72d128"

RPROVIDES:${PN} += "python3.10dist-gitdb \
python310-gitdb \
python310-gitdb2 \
python3dist-gitdb"

RDEPENDS:${PN} += "python-abi \
python310-smmap"

inherit rpm
