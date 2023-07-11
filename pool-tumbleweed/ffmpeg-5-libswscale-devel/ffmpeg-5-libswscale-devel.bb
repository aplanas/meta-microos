SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libswscale-devel-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "84cfc012a4e8eebe8cb2a008113683eae1a871d9de01d7c8621f0575d98230c250066cfe3d09b07dcfc305e7dfd0770ad03bf1f72bc4cdbb9e89f5dc7c56dbc0"

RPROVIDES:${PN} += "ffmpeg-5-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavutil-devel \
libswscale6 \
pkgconfig-libavutil"

inherit rpm
