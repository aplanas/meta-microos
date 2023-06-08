SUMMARY = "MikMod input plugin for the C* Music Player"
DESCRIPTION = "This package provides MikMod (tracker) input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-mikmod-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "1b4a6ef16913e0c6233a2d80e77c35312b17d118c91cbeb561cdcb40f242ee1d8507c358cfa72c965577c99dee37728e68edb192ff064b2976a0e6c31b5b48ab"

RPROVIDES:${PN} += "cmus-plugin-mikmod cmus-plugin-mikmod(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmikmod.so.3()(64bit)"

inherit rpm
