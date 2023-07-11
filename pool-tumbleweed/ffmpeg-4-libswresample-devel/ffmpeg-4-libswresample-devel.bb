SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libswresample-devel-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "49f9c5fd76a185e72710db031a78626569f02919ea9a19939d3c1243b31aa5a5fe08f3d650c7ab1dd37e2e18ddd790822669d1c126dabbf472e9113b4d547470"

RPROVIDES:${PN} += "ffmpeg-4-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libswresample3-9 \
pkgconfig-libavutil"

inherit rpm
