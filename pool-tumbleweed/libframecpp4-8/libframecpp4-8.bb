SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp4-8-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "c0876cb8c3cf1253e05b882064a156343ae5d454996d51c99c6b437a3c59e7af636cb80732130db2697c75dacef707dbeb18a92d370e47863563de26a7bdd623"

RPROVIDES:${PN} += "libframecpp4-8 \
libframecpp4-8(aarch-64) \
libframecpp4.so.8()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libframecpp3.so.6()(64bit) \
libframecppcmn.so.11()(64bit) \
libgcc_s.so.1()(64bit) \
libldastoolsal.so.7()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
