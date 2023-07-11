SUMMARY = "Development files for ffmpegthumbnailer"
DESCRIPTION = "Video thumbnailer that can be used by file managers. \
 \
This video thumbnailer can be used to create thumbnails for video \
files. The thumbnailer uses ffmpeg to decode frames from files."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "libffmpegthumbnailer-devel-2.2.2-2.7.aarch64.rpm"
RPM_HASH = "8837999082c0cb8cb4b251f433566b6c53f1c9d14b20781fdf387fe91247c0601cd09917b2ed0bcf279adb1466986b7d611f8c09cff00fe8b9ec0f3b9ffd627c"

RPROVIDES:${PN} += "libffmpegthumbnailer-devel \
pkgconfig-libffmpegthumbnailer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libffmpegthumbnailer4"

inherit rpm
