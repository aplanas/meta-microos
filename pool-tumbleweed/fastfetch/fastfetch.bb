SUMMARY = "Neofetch-like tool written in C"
DESCRIPTION = "Fastfetch is a neofetch-like tool for fetching system information and displaying them in a pretty way. \
It is written in pure c, with performance and customizability in mind. Currently Linux, Android, FreeBSD, \
MacOS and Windows 7+ are supported."
LICENSE = "MIT"

PV = "1.11.3"

RPM_NAME = "fastfetch-1.11.3-1.1.aarch64.rpm"
RPM_HASH = "f350a831c18faace647e9dc95585321648d06ec6c13312aacae5fa9ad0f896e260fa14c095b629faab62a4da841f4727d382e7d5b804c29a12ada02b6299661b"

RPROVIDES:${PN} += "fastfetch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
