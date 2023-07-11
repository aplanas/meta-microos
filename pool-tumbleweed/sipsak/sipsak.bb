SUMMARY = "SIP Swiss Army Knife"
DESCRIPTION = "Sipsak is a small command line tool for developers and administrators \
of Session Initiation Protocol (SIP) applications. It can be used for \
some simple tests on SIP applications and devices, including sending \
OPTIONS requests, sending text files with SIP requests, traceroute, \
user location test, flooding test, etc"
LICENSE = "GPL-2.0-only"

PV = "0.9.8.1"

RPM_NAME = "sipsak-0.9.8.1-1.12.aarch64.rpm"
RPM_HASH = "a70bb04a610a232020f0b3cb8f82645ac3f7e2e67224ad81e03ac4665b637ec859df5d5611be6d696d2176dc89e5f3f090cb63f0c06533d8cd3f2aa6e9aafcf6"

RPROVIDES:${PN} += "sipsak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3"

inherit rpm
