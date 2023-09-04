SUMMARY = "Python3 bindings for ldns"
DESCRIPTION = "Python bindings for the ldns library"
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "python3-ldns-1.8.3-1.8.aarch64.rpm"
RPM_HASH = "b124e0d2c1f931b3623fc6ca3b2d1015ff941854eea6330385705fdddd021297c9c991838abd98467eb90bd6315b90cb5c88a7d37d2fd83bc8df1c5f933c756f"

RPROVIDES:${PN} += "python3-ldns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldns.so.3 \
libldns3 \
libpython3.11.so.1.0 \
python-abi"

inherit rpm
