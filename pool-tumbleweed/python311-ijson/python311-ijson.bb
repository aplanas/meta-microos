SUMMARY = "Iterative JSON parser with a standard Python iterator interface"
DESCRIPTION = "Iterative JSON parser with a standard Python iterator interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "python311-ijson-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "da1575eccf41943bd8f2f59d82830f72a959a5e2eb475794daef7283df82a7761b15532b4b73b1c571ed68f335349faacce9f4ab07607bd19dd88e0ec14a9785"

RPROVIDES:${PN} += "python3-ijson \
python3.11dist-ijson \
python311-ijson \
python3dist-ijson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
