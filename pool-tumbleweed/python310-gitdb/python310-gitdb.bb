SUMMARY = "Git Object Database"
DESCRIPTION = "GitDB is a pure-Python git object database"
LICENSE = "BSD-3-Clause"

PV = "4.0.10"

RPM_NAME = "python310-gitdb-4.0.10-2.1.aarch64.rpm"
RPM_HASH = "0be98e929b54cce19401ac70f92d0eaff5d93d7b083b07531185efdfcf519abad24a318ae78fc927effd982ab8471ce1559817e22df8490b2eaec364a6c2ea76"

RPROVIDES:${PN} += "python3-gitdb \
python3-gitdb2 \
python3.10dist(gitdb) \
python310-gitdb \
python310-gitdb(aarch-64) \
python310-gitdb2 \
python3dist(gitdb)"

RDEPENDS:${PN} += "python(abi) \
python310-smmap"

inherit rpm
