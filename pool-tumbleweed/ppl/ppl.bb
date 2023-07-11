SUMMARY = "The Parma Polyhedra Library"
DESCRIPTION = "The Parma Polyhedra Library (PPL) is a library for the manipulation of \
(not necessarily closed) convex polyhedra and other numerical \
abstractions.  The applications of convex polyhedra include program \
analysis, optimized compilation, integer and combinatorial optimization \
and statistical data-editing.  The Parma Polyhedra Library comes with \
several user friendly interfaces, is fully dynamic (available virtual \
memory is the only limitation to the dimension of anything), written in \
accordance to all the applicable standards, exception-safe, rather \
efficient, thoroughly documented, and free software.  This package \
provides all what is necessary to run applications using the PPL \
through its C and C++ interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "ppl-1.2-3.2.aarch64.rpm"
RPM_HASH = "6415e1ffcfba313277736d3771cc100966b8c2206baa97f01784724693b2d9dae052878be5ebef153b9dde01affde748857a72c7854ca0b62ded1c10542369bf"

RPROVIDES:${PN} += "ppl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libppl.so.14 \
libstdc++.so.6"

inherit rpm
