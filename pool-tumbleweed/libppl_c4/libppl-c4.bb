SUMMARY = "C interface of the Parma Polyhedra Library"
DESCRIPTION = "Shared library for the Parma Polyhedra Library C bindings."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "libppl_c4-1.2-3.1.aarch64.rpm"
RPM_HASH = "cfc55b3fc549413459194cac228293a58f3b099381f1e8ea3a3ce8bc8b91b431bf6a18d49717dbdb75ebcf331850442bf1b3c57c90a733ce6fd32543e9f77bbb"

RPROVIDES:${PN} += "libppl_c.so.4()(64bit) \
libppl_c4 \
libppl_c4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libgmpxx.so.4()(64bit) \
libppl.so.14()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
