SUMMARY = "Empathy importer plugin for libpurple"
DESCRIPTION = "Empathy importer plugin for libpurple"
LICENSE = "GPL-3.0+"

PV = "0.1.0"

RPM_NAME = "libpurple-plugin-import-empathy-0.1.0-1.20.aarch64.rpm"
RPM_HASH = "e839caab6c6e2c721831b62038da4f815cb8e720077c46b5ef6e907a580787372d7b59bd1a418c42c3f1df089dfdf5923956b9901db48d8aec9de8bd05988230"

RPROVIDES:${PN} += "libpurple-plugin-import-empathy \
libpurple-plugin-import-empathy(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libpurple.so.0()(64bit)"

inherit rpm
