SUMMARY = "Ruby bindings for libprelude"
DESCRIPTION = "Ruby bindings for libprelude generated by SWIG."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "ruby-libprelude-5.2.0-2.17.aarch64.rpm"
RPM_HASH = "47cec0a26ca7808d35e5fd47b1d34fdde048a41eb72c0490c63d48a2cf87b18bfb24dbb1f7235b43b88feff2d669bc8ecb4be34dbc47d385a2b829b430c57a4e"

RPROVIDES:${PN} += "ruby-libprelude"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprelude.so.28 \
libprelude28 \
libpreludecpp.so.12 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
ruby"

inherit rpm
