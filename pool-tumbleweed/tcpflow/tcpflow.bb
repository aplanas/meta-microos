SUMMARY = "Program for capturing and collecting TCP streams"
DESCRIPTION = "tcpflow is a program that captures data transmitted as part of TCP connections \
(flows), and stores the data in a way that is convenient for protocol \
analysis and debugging. Each TCP flow is stored in its own file. Thus, the \
typical TCP flow will be stored in two files, one for each direction. \
tcpflow can also process stored 'tcpdump' packet flows."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.1"

RPM_NAME = "tcpflow-1.6.1-2.10.aarch64.rpm"
RPM_HASH = "d5693bcaaf8def60d94778afb3b64a5409dfbfcbc1cbaec704172bd24bfa9b6502096b31a0f5d1b7d65c81b2026bb2ba7d79a49e7886f8a4b8427c74138dbc42"

RPROVIDES:${PN} += "tcpflow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libpcap.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
