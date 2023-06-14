SUMMARY = "Iterative JSON parser with a standard Python iterator interface"
DESCRIPTION = "Iterative JSON parser with a standard Python iterator interface."
LICENSE = "BSD-3-Clause"

PV = "3.1.4"

RPM_NAME = "python39-ijson-3.1.4-1.11.aarch64.rpm"
RPM_HASH = "add5433200d9f75c6c017b82be046d80330c3be5c2b9a7e54ce8467c3ef84b3b928c30b3ae43c90ca06c1c106cc41ee80129a39874aa77e92d5d8da0a82447a1"

RPROVIDES:${PN} += "python3.9dist-ijson \
python39-ijson \
python3dist-ijson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
