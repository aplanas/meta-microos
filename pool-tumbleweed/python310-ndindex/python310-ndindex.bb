SUMMARY = "A Python library for manipulating indices of ndarrays"
DESCRIPTION = "A Python library for manipulating indices of ndarrays."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python310-ndindex-1.6-1.3.aarch64.rpm"
RPM_HASH = "384fc5838c6d571d800392bc624276e3af3ac81b7021316e42d425517cbb840309903ca6d594e534a3df5e38583f24dcd1631c5865036fb6a9aed6b34a3ce718"

RPROVIDES:${PN} += "python3.10dist-ndindex \
python310-ndindex \
python3dist-ndindex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
