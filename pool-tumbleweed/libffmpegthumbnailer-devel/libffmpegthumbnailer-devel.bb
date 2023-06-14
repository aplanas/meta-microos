SUMMARY = "Development files for ffmpegthumbnailer"
DESCRIPTION = "Video thumbnailer that can be used by file managers. \
 \
This video thumbnailer can be used to create thumbnails for video \
files. The thumbnailer uses ffmpeg to decode frames from files."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "libffmpegthumbnailer-devel-2.2.2-2.6.aarch64.rpm"
RPM_HASH = "f058d678b4f5e9c33c02d792931c9d308d141b87954c6102f469995c318fca0090246960485c2f9eefe15fad5297cc05fb23408a4cf26687f6b5eecb8d44e475"

RPROVIDES:${PN} += "libffmpegthumbnailer-devel \
pkgconfig-libffmpegthumbnailer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libffmpegthumbnailer4"

inherit rpm
