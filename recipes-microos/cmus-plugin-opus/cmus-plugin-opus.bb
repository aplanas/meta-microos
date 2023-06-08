SUMMARY = "Opus input plugin for the C* Music Player"
DESCRIPTION = "This package provides Opus input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-opus-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "1dc11be69f4abf30ca16d0927d0906fcc067be4374cf462e7e9a5a17c6c6fbbbbfb641abc762ac66d7f9a4766d758353d0e5d1d88f4b7e956da049c16ede5990"

RPROVIDES:${PN} += "cmus-plugin-opus cmus-plugin-opus(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libopusfile.so.0()(64bit)"

inherit rpm
