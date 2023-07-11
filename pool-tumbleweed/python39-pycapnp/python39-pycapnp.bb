SUMMARY = "Cython wrapping of the C++ Cap'n Proto library"
DESCRIPTION = "A cython wrapping of the C++ Cap'n Proto library."
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python39-pycapnp-1.2.2-1.8.aarch64.rpm"
RPM_HASH = "a0442a9468422277936a6c59983b278a9f7de40c6317c3de28674b72e50acd9359b9944d675c3102e0b72fdefffe9a74b80c2f6aa4cb59f6e1bbcf1cd9bcd7c4"

RPROVIDES:${PN} += "python3.9dist-pycapnp \
python39-pycapnp \
python3dist-pycapnp"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcapnp-0.10.4.so \
libcapnp-rpc-0.10.4.so \
libcapnpc-0.10.4.so \
libgcc-s.so.1 \
libkj-0.10.4.so \
libkj-async-0.10.4.so \
libstdc++.so.6 \
python-abi"

inherit rpm
