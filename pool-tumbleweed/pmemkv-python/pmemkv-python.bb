SUMMARY = "Machine administration"
DESCRIPTION = "Python bindings for pmemkv. Currently functionally equal to pmemkv in version 1.0. Some of the new functionalities (from pmemkv 1.1) are not yet available."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "pmemkv-python-1.0-2.13.aarch64.rpm"
RPM_HASH = "23ffea4d3cc030a8718421fa4722efb2032ffd1e1934005213c5d8d4bdc1237789c031d59a158ef7149b98a35c96280e46007219edbc4cdce91bcb8e706db762"

RPROVIDES:${PN} += "pmemkv-python \
pmemkv-python-1.0-2.13 \
python3.11dist-pmemkv \
python3dist-pmemkv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpmemkv-json-config.so.1 \
libpmemkv.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
