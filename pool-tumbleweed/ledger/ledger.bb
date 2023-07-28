SUMMARY = "Double-entry accounting system with a command-line reporting interface"
DESCRIPTION = "Ledger is a powerful, double-entry accounting system that is accessed from \
the UNIX command-line. This may put off some users, since there is no \
flashy UI, but for those who want unparalleled reporting access to their \
data there are few alternatives."
LICENSE = "BSD-3-Clause"

PV = "3.3.2"

RPM_NAME = "ledger-3.3.2-1.1.aarch64.rpm"
RPM_HASH = "a0f1c2b64224b87c492311d08b27005f3604151262070929ab115aeb29ef91386b9c9c35a2247176f9955d33a1711edcb09b3e6409c0f7de37b9be6b8de245db"

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
