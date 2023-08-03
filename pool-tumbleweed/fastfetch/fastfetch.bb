SUMMARY = "Neofetch-like tool written in C"
DESCRIPTION = "Fastfetch is a neofetch-like tool for fetching system information and displaying them in a pretty way. \
It is written in pure c, with performance and customizability in mind. Currently Linux, Android, FreeBSD, \
MacOS and Windows 7+ are supported."
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "fastfetch-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "9fb014f48edb69e83763497edda3740deb4d0213bbdc4bf132cb02ea4f17dd89a68e3b8531d7f13615bb3afab21fcbc2610ed62907866963bdda99e4cda0ce0f"

RPROVIDES:${PN} += "fastfetch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
