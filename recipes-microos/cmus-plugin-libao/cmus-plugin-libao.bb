SUMMARY = "Libao output plugin for the C* Music Player"
DESCRIPTION = "This package provides libao output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-libao-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "b91a6cefbd1a08d99cb962a520b64c47a18e666d971ac961f8aeb6ee240ffadf105c46885768aa5f411d116cae23e7d38a7d20be15548e8b8d8b57c9dd200797"

RPROVIDES:${PN} += "cmus-plugin-libao cmus-plugin-libao(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libao.so.4()(64bit) libao.so.4(LIBAO4_1.1.0)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
