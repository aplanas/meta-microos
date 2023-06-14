SUMMARY = "Machine administration"
DESCRIPTION = "Python bindings for pmemkv. Currently functionally equal to pmemkv in version 1.0. Some of the new functionalities (from pmemkv 1.1) are not yet available."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "pmemkv-python-1.0-2.12.aarch64.rpm"
RPM_HASH = "a5343a42b2f936cfc0d69cccdd28d017a281ad78aba249fb317e1dd62772dc118f4ea804e880c941e897dcd5301a3c13f6ac5b9ac8e2fcf76eb4efd2f2750f5c"

RPROVIDES:${PN} += "pmemkv-python \
pmemkv-python-1.0-2.12 \
python3.10dist-pmemkv \
python3dist-pmemkv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpmemkv-json-config.so.1 \
libpmemkv.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
