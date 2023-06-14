SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libswresample-devel-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "fd517334f4ef259688c01046800222c9377af287db8f8056ca3ff2124d22ced9e34e48331b88dcbf94d6d5a676e481d77bb57e022b2b657b9237a67262d60503"

RPROVIDES:${PN} += "ffmpeg-4-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libswresample3-9 \
pkgconfig-libavutil"

inherit rpm
