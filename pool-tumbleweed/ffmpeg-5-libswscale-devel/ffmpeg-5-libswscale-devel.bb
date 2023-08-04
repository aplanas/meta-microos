SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libswscale-devel-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "cd121d7c5e3c48daac18f6207ed0d67b9ce8f5e6c38b817e29ffddabfcee1fd3fba02b22000b736d745640cdf274e11016b4bb18f7e9f4bddb4d60535699fe46"

RPROVIDES:${PN} += "ffmpeg-5-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavutil-devel \
libswscale6 \
pkgconfig-libavutil"

inherit rpm
