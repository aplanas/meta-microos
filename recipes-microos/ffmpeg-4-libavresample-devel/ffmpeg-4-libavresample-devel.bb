SUMMARY = "Development files for libavresample as present in FFmpeg"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code. \
 \
This subpackage contains the headers for FFmpeg's copy of libavresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavresample-devel-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "f34f5d075120db4b2a1b6aa26c27fe52b2c6190053cc0efb9c4cbea5d508787045bd83d1384abfed0ba8b2be8478ed4e9880ddd0522f1d3865c3cffdeaa8a242"

RPROVIDES:${PN} += "ffmpeg-4-libavresample-devel ffmpeg-4-libavresample-devel(aarch-64) libavresample-devel pkgconfig(libavresample)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-4-libavutil-devel libavresample4_0 pkgconfig(libavutil)"

inherit rpm
