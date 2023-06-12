SUMMARY = "Text categorization library"
DESCRIPTION = "Graphite2 is a project within SIL's Non-Roman Script Initiative and Language \
Software Development groups to provide rendering capabilities for complex \
non-Roman writing systems. Graphite can be used to create 'smart fonts' capable \
of displaying writing systems with various complex behaviors. With respect to \
the Text Encoding Model, Graphite handles the 'Rendering' aspect of writing \
system implementation."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "1.3.14"

RPM_NAME = "libgraphite2-3-1.3.14-3.7.aarch64.rpm"
RPM_HASH = "1f0cd0e16c50766736683732ded5d5bcb55f1ef7966feb8e05d39ff7de0905ec5e6f2e38e5ea24e1143b2314a7dbf7b0eed225a1b3f05fcf1787fd67aa1594d7"

RPROVIDES:${PN} += "libgraphite2-3 \
libgraphite2-3(aarch-64) \
libgraphite2.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
