SUMMARY = "Python3 bindings for the LDB library"
DESCRIPTION = "This package contains the python3 bindings for the LDB library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "python3-ldb-2.7.2-1.2.aarch64.rpm"
RPM_HASH = "94d108c845d4d662a820e5db15a4e5883828caaa56d3b062b6f937948edf527d39f7fab72efaeaa16bbb40f915976cd9cdde12cf48556519be6cd68fad7749b4"

RPROVIDES:${PN} += "libpyldb-util.cpython-311-aarch64-linux-gnu.so.2 \
python3-ldb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libldb.so.2 \
libldb2 \
libpython3.11.so.1.0 \
libtalloc.so.2 \
python-abi"

inherit rpm
