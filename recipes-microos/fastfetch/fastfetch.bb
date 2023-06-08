SUMMARY = "Neofetch-like tool written in C"
DESCRIPTION = "Fastfetch is a neofetch-like tool for fetching system information and displaying them in a pretty way. \
It is written in pure c, with performance and customizability in mind. Currently Linux, Android, FreeBSD, \
MacOS and Windows 7+ are supported."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "fastfetch-1.10.3-1.3.aarch64.rpm"
RPM_HASH = "5d16bbd4ab584242dde94fba783150a7f5eecf3c14e3e9f28fbe57de4e447b27af0396b311dfc8829b39928d9409108659ddad0c7ba9c4ced0468cb557f0ee20"

RPROVIDES:${PN} += "config(fastfetch) fastfetch fastfetch(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
