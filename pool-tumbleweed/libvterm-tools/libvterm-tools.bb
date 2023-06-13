SUMMARY = "Tools for libvterm"
DESCRIPTION = "This package contains tools for libvterm."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libvterm-tools-0.3.2-1.1.aarch64.rpm"
RPM_HASH = "5c6e2fb199488867db08b29483da1202c35bd22870e5ecc4e16d8a09925550d6488fe74d3034ff863ee1c1be2443adfd42a11c158bb6ac327cb95036bd0b06a0"

RPROVIDES:${PN} += "libvterm-tools \
libvterm-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libvterm.so.0()(64bit)"

inherit rpm
