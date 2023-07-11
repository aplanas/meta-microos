SUMMARY = "Font rendering capabilities for complex non-Roman writing systems"
DESCRIPTION = "Graphite2 is a project within SIL's Non-Roman Script Initiative and Language \
Software Development groups to provide rendering capabilities for complex \
non-Roman writing systems. Graphite can be used to create 'smart fonts' capable \
of displaying writing systems with various complex behaviors. With respect to \
the Text Encoding Model, Graphite handles the 'Rendering' aspect of writing \
system implementation."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "1.3.14"

RPM_NAME = "graphite2-1.3.14-3.8.aarch64.rpm"
RPM_HASH = "9a10d4782247eae2805d15770e15f43a8031c167e0763e7f395294a2135d0a644ff49771cb598e01a0e815e32682767b1a51114b948abc93ec56cf391745c51c"

RPROVIDES:${PN} += "graphite2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgraphite2.so.3 \
libstdc++.so.6"

inherit rpm
