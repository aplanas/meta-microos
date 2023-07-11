SUMMARY = "FFmpeg plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the FFmpeg plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-ffmpeg-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "c8684dd6f03ced7a1212c774643b02a4e8c39a69a718171da2362f103a47b044ad2301e13785e690a9a6b455460733636834d3ba9bccbc350af381c39916f3e0"

RPROVIDES:${PN} += "audaspace-fileplugin \
audaspace-plugin-ffmpeg \
libaudffmpeg.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.4 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
