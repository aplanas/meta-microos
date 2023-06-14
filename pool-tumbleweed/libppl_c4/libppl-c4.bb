SUMMARY = "C interface of the Parma Polyhedra Library"
DESCRIPTION = "Shared library for the Parma Polyhedra Library C bindings."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "libppl_c4-1.2-3.1.aarch64.rpm"
RPM_HASH = "cfc55b3fc549413459194cac228293a58f3b099381f1e8ea3a3ce8bc8b91b431bf6a18d49717dbdb75ebcf331850442bf1b3c57c90a733ce6fd32543e9f77bbb"

RPROVIDES:${PN} += "libppl-c.so.4 \
libppl-c4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libppl.so.14 \
libstdc++.so.6"

inherit rpm
