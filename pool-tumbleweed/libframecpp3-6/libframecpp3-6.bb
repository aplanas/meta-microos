SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp3-6-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "2ea32f6587b66ef05d07148446bb289da9d30ada737549d735e0be2acd37aba764daa5476f2b73f15c53509d71cc36870014fe89ee723a6f04732c9fc1e670a6"

RPROVIDES:${PN} += "libframecpp3-6 \
libframecpp3-6(aarch-64) \
libframecpp3.so.6()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libframecppcmn.so.11()(64bit) \
libgcc_s.so.1()(64bit) \
libldastoolsal.so.7()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
