SUMMARY = "Git Object Database"
DESCRIPTION = "GitDB is a pure-Python git object database"
LICENSE = "BSD-3-Clause"

PV = "4.0.10"

RPM_NAME = "python39-gitdb-4.0.10-2.1.aarch64.rpm"
RPM_HASH = "242b271bb8b1d0b68dae1ee1cbbfc247efefc9fc8bdfb0cc881861b0968edcf38d4a0c07b2bec04f78212262c320cbafbdd6997bf1376a6bc702d82299bc8ef0"

RPROVIDES:${PN} += "python3.9dist(gitdb) \
python39-gitdb \
python39-gitdb(aarch-64) \
python39-gitdb2 \
python3dist(gitdb)"
RDEPENDS:${PN} += "python(abi) \
python39-smmap"

inherit rpm
