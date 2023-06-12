SUMMARY = "MikMod input plugin for the C* Music Player"
DESCRIPTION = "This package provides MikMod (tracker) input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-mikmod-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "08beb27943969c1fb4d59a85c17275ac29b5f1a1dec2938ddec7fdea8aea33b8a76efdf23dd027a8362b62b167c5f57dc7df6b43e615f44fa562cbc5483f8239"

RPROVIDES:${PN} += "cmus-plugin-mikmod \
cmus-plugin-mikmod(aarch-64)"
RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmikmod.so.3()(64bit)"

inherit rpm
