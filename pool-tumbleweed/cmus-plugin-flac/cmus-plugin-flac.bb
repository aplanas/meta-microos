SUMMARY = "FLAC input plugin for the C* Music Player"
DESCRIPTION = "This package provides FLAC input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-flac-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "14e3727570467e08a6227985835bbcec76a1693d0f4d076b64e4e975b72870f7b9f73d339b04b498475c3a4628ed29fca48126c3f6ea15d09042853acc54f85d"

RPROVIDES:${PN} += "cmus-plugin-flac \
cmus-plugin-flac(aarch-64)"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1()(64bit) \
libFLAC.so.12()(64bit) \
libc.so.6()(64bit)"

inherit rpm
