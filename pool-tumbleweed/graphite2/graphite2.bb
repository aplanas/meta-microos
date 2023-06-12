SUMMARY = "Font rendering capabilities for complex non-Roman writing systems"
DESCRIPTION = "Graphite2 is a project within SIL's Non-Roman Script Initiative and Language \
Software Development groups to provide rendering capabilities for complex \
non-Roman writing systems. Graphite can be used to create 'smart fonts' capable \
of displaying writing systems with various complex behaviors. With respect to \
the Text Encoding Model, Graphite handles the 'Rendering' aspect of writing \
system implementation."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "1.3.14"

RPM_NAME = "graphite2-1.3.14-3.7.aarch64.rpm"
RPM_HASH = "4083fcaa22e53af564b9e6d9e7d681bc6f3b71e7dbd7d9a45c9fb575ac85e9ff4059a777fea7253cfbe2810d2f299979893448d351cac069facca891112e9be4"

RPROVIDES:${PN} += "graphite2 \
graphite2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgraphite2.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm