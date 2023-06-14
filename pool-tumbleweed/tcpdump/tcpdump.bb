SUMMARY = "A Packet Sniffer"
DESCRIPTION = "This program can 'read' all or only certain packets going over the \
ethernet. It can be used to debug specific network problems."
LICENSE = "BSD-3-Clause"

PV = "4.99.4"

RPM_NAME = "tcpdump-4.99.4-1.1.aarch64.rpm"
RPM_HASH = "4fb1f346ca081f1999d17d2df8f008b92f23d14f5fd93d02ded84fa2e4c14de62cb07cda0c382e7e9c960939f77b53861a2305a66cdd420911053ad0759b203a"

RPROVIDES:${PN} += "tcpdump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcap \
libpcap.so.1 \
libsmi.so.2"

inherit rpm
