SUMMARY = "Vorbis input plugin for the C* Music Player"
DESCRIPTION = "This package provides Vorbis input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-vorbis-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "54e33accb1fffe584bd7d92220e11681541b9707578784f15561f98d9e89f141424a936176d75696d65a607a3b12faf419f9ec6032e557f31038340a80b50bb2"

RPROVIDES:${PN} += "cmus-plugin-vorbis cmus-plugin-vorbis(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libvorbisfile.so.3()(64bit)"

inherit rpm
