SUMMARY = "Python3 bindings for the Talloc library"
DESCRIPTION = "This package contains the Python3 bindings for the Talloc library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "python3-talloc-2.4.0-3.1.aarch64.rpm"
RPM_HASH = "876c3c466438dfae98067ee960c56a04fc3ee359eef6f8d67ef947f65ccf870e40309c02388792095f17be3b5b90a121345cf3bf17e03262dce7b3941ba63e4a"

RPROVIDES:${PN} += "libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2()(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL.CPYTHON_310_AARCH64_LINUX_GNU_2.4.0)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.0.6)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.0.7)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.0.8)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.0)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.1)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.10)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.11)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.12)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.13)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.14)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.15)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.16)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.2)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.3)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.4)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.5)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.6)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.7)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.8)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.1.9)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.2.0)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.3.0)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.3.1)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.3.2)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.3.3)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.3.4)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.3.5)(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2(PYTALLOC_UTIL_2.4.0)(64bit) \
python3-talloc \
python3-talloc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpython3.10.so.1.0()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libtalloc2 \
python(abi)"

inherit rpm
