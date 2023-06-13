SUMMARY = "Python3 bindings for the LDB library"
DESCRIPTION = "This package contains the python3 bindings for the LDB library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "python3-ldb-2.7.2-1.1.aarch64.rpm"
RPM_HASH = "b2ea89b34a50ad6ba32d387aba5b679f08cc58c7c2ecc91a41bc06642a51ef90e4ff681e1d07018eedff9bbfda624008d82eb47eb84f0d8e2b6ed41d20300f33"

RPROVIDES:${PN} += "libpyldb-util.cpython-310-aarch64-linux-gnu.so.2()(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL.CPYTHON_310_AARCH64_LINUX_GNU_2.7.2)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.10)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.11)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.12)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.13)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.14)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.15)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.16)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.17)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.18)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.19)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.2)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.20)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.21)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.22)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.23)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.24)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.25)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.26)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.27)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.28)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.29)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.3)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.30)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.31)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.4)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.5)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.6)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.7)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.8)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.1.9)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.2.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.2.1)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.2.2)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.2.3)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.3.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.3.1)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.3.2)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.4.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.4.1)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.5.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.5.1)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.5.2)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.5.3)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.6.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.6.1)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.6.2)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_1.6.3)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.0.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.0.1)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.0.2)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.0.3)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.0.4)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.0.5)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.1.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.1.1)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.2.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.4.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.4.1)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.5.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.6.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.6.1)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.7.0)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.7.1)(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2(PYLDB_UTIL_2.7.2)(64bit) \
python3-ldb \
python3-ldb(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libldb.so.2()(64bit) \
libldb.so.2(LDB_0.9.10)(64bit) \
libldb.so.2(LDB_0.9.15)(64bit) \
libldb.so.2(LDB_1.0.2)(64bit) \
libldb.so.2(LDB_1.1.22)(64bit) \
libldb2 \
libpython3.10.so.1.0()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
python(abi)"

inherit rpm
