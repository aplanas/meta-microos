SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libswscale-devel-6.0-2.4.aarch64.rpm"
RPM_HASH = "ac7aa1732c47a2db2a9fabac1cc2cb6f2cd17592631e5f6f1a714d05447be1cfc2a04ee54941ddf00d694222e68059e4554dcaceedfa7f43196f2c443b9954fe"

RPROVIDES:${PN} += "ffmpeg-6-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavutil-devel \
libswscale7 \
pkgconfig-libavutil"

inherit rpm
