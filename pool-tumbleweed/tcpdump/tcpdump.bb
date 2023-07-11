SUMMARY = "A Packet Sniffer"
DESCRIPTION = "This program can 'read' all or only certain packets going over the \
ethernet. It can be used to debug specific network problems."
LICENSE = "BSD-3-Clause"

PV = "4.99.4"

RPM_NAME = "tcpdump-4.99.4-1.2.aarch64.rpm"
RPM_HASH = "8776f4a695425ed9547d36c3404b0f7b2b4d89b6f81cc97c4387b209d86a869c1c3fbd1d79784395b9c429cff8df4fa83f2c62c4b2539c115e05425c0f560740"

RPROVIDES:${PN} += "tcpdump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcap \
libpcap.so.1 \
libsmi.so.2"

inherit rpm
