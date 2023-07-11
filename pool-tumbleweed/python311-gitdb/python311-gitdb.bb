SUMMARY = "Git Object Database"
DESCRIPTION = "GitDB is a pure-Python git object database"
LICENSE = "BSD-3-Clause"

PV = "4.0.10"

RPM_NAME = "python311-gitdb-4.0.10-2.3.aarch64.rpm"
RPM_HASH = "223fa16029ec13761af51a4422132b0ac534425af0cedf73aab3ba71ece980d308113b8cff2e71869f48a5ac0d93a0e1298542c823c372be44db8de2037b8326"

RPROVIDES:${PN} += "python3-gitdb \
python3-gitdb2 \
python3.11dist-gitdb \
python311-gitdb \
python311-gitdb2 \
python3dist-gitdb"

RDEPENDS:${PN} += "python-abi \
python311-smmap"

inherit rpm
