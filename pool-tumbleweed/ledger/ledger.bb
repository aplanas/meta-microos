SUMMARY = "Double-entry accounting system with a command-line reporting interface"
DESCRIPTION = "Ledger is a powerful, double-entry accounting system that is accessed from \
the UNIX command-line. This may put off some users, since there is no \
flashy UI, but for those who want unparalleled reporting access to their \
data there are few alternatives."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "ledger-3.2.1-3.16.aarch64.rpm"
RPM_HASH = "8bfd3de50dd1c7b19035196a92024bbdcbec2f5d25819ac6821d211ae331dec02d055076f31d883fe81ea8095a104f34d47ce7cbbfa65fbd8684de3bbc551b39"

RPROVIDES:${PN} += "ledger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
