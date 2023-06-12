SUMMARY = "CUE input plugin for the C* Music Player"
DESCRIPTION = "This package provides CUE sheet support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-cue-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "8eea29d2153fc8ad60f7c2f8b58a22f3e34be20109123d03002f0ca30d4d3f1328050deda608399ab0626d85c49857355fff9de320fe90aa95f06a09d58d90e7"

RPROVIDES:${PN} += "cmus-plugin-cue \
cmus-plugin-cue(aarch-64)"
RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
