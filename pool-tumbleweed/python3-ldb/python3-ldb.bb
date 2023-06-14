SUMMARY = "Python3 bindings for the LDB library"
DESCRIPTION = "This package contains the python3 bindings for the LDB library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "python3-ldb-2.7.2-1.1.aarch64.rpm"
RPM_HASH = "b2ea89b34a50ad6ba32d387aba5b679f08cc58c7c2ecc91a41bc06642a51ef90e4ff681e1d07018eedff9bbfda624008d82eb47eb84f0d8e2b6ed41d20300f33"

RPROVIDES:${PN} += "libpyldb-util.cpython-310-aarch64-linux-gnu.so.2 \
python3-ldb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libldb.so.2 \
libldb2 \
libpython3.10.so.1.0 \
libtalloc.so.2 \
python-abi"

inherit rpm
