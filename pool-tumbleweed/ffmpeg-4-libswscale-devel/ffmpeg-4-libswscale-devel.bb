SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libswscale-devel-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "f0b3c420d08422ad0d0ac6cffcf88501fb344aaee20378e132cc3852c7b2348369ddecfb3ca5af1e28f441db8f1bc3e105494833dc517d25fe1fcda7e197926a"

RPROVIDES:${PN} += "ffmpeg-4-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libswscale5-9 \
pkgconfig-libavutil"

inherit rpm
