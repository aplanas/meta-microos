SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libswscale-devel-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "5ef12f0fb99d3e19a327668aacbc4e27395203ac9cc86f7a7fac7409d71e57b67e0cf5bf6f11ed7105f87e7234290253adb090e1e21021521d6daffbca0d6544"

RPROVIDES:${PN} += "ffmpeg-5-libswscale-devel \
ffmpeg-5-libswscale-devel(aarch-64) \
libswscale-devel \
pkgconfig(libswscale)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavutil-devel \
libswscale6 \
pkgconfig(libavutil)"

inherit rpm
