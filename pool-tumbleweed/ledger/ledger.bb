SUMMARY = "Double-entry accounting system with a command-line reporting interface"
DESCRIPTION = "Ledger is a powerful, double-entry accounting system that is accessed from \
the UNIX command-line. This may put off some users, since there is no \
flashy UI, but for those who want unparalleled reporting access to their \
data there are few alternatives."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "ledger-3.2.1-3.17.aarch64.rpm"
RPM_HASH = "a4376a826327b1cffeb1e67ec2f36c3b42a91d2f0b13412a405ed77c4a8e29cb694642ecb39a0463de98eed2391db43d103b15dc68e74f070d32b98f5cfa51e6"

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
