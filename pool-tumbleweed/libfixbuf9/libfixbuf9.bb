SUMMARY = "Development files for the libfixbuf library"
DESCRIPTION = "libfixbuf is a compliant implementation of the IPFIX Protocol, as defined in \
RFC 5101. It supports the information model defined in RFC 5102, extended as \
proposed by RFC 5103 to support information elements for representing biflows. \
libfixbuf supports UDP, TCP, SCTP, TLS over TCP, and Spread as transport \
protocols."
LICENSE = "LGPL-3.0-only"

PV = "2.4.2"

RPM_NAME = "libfixbuf9-2.4.2-1.1.aarch64.rpm"
RPM_HASH = "5688ab81393af24d93334b25dbe197cb9a0f75c391b84723488d3d53e3e73232cfe871e21089ae2d164e61600d5c1dd1b8fb6dc04e1e9fd6eb270f623d4d46c9"

RPROVIDES:${PN} += "libfixbuf.so.9()(64bit) \
libfixbuf9 \
libfixbuf9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
