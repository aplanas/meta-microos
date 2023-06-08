SUMMARY = "FLAC input plugin for the C* Music Player"
DESCRIPTION = "This package provides FLAC input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-flac-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "0cab1c4db7e3bdaabc5fbcec412a7fd9d615db61771b27abf78e1529f1314dbc8390d0b0c4751cfe9fe397c9f79842fcdd9e4eed53fca3e3142b97f14a3ac2c8"

RPROVIDES:${PN} += "cmus-plugin-flac cmus-plugin-flac(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFLAC.so.12()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
