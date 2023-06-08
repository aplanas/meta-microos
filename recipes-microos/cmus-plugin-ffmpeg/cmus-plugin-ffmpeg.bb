SUMMARY = "FFmpeg input plugin for the C* Music Player"
DESCRIPTION = "This package provides FFmpeg input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-ffmpeg-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "234f64d9866ee4fb51db1acf5d9dc9f2418d69f7706ebdfcda84f6b5412d25bbfcb814455b5871d034d1fdc9b25083142c8c34ca6b79a5e600bbfeab21faf777"

RPROVIDES:${PN} += "cmus-plugin-ffmpeg cmus-plugin-ffmpeg(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavcodec.so.59()(64bit) libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) libavformat.so.59()(64bit) libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) libc.so.6(GLIBC_2.17)(64bit) libswresample.so.4.ff5()(64bit) libswresample.so.4.ff5(LIBSWRESAMPLE_4.7_SUSE)(64bit)"

inherit rpm
