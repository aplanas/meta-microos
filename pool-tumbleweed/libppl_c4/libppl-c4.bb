SUMMARY = "C interface of the Parma Polyhedra Library"
DESCRIPTION = "Shared library for the Parma Polyhedra Library C bindings."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "libppl_c4-1.2-3.2.aarch64.rpm"
RPM_HASH = "fcda7d121a4914678ca45d0b2bf5df15e378fd863c51e55ca117dc005dcb4d9d3c04fa686593c20e573106cb882e11bea0bae85679e02b2578b0d9ca6fabba6a"

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
