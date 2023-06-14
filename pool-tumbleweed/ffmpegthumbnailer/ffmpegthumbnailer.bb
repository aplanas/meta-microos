SUMMARY = "Video thumbnailer that can be used by file managers"
DESCRIPTION = "This video thumbnailer can be used to create thumbnails for \
video files. The thumbnailer uses ffmpeg to decode frames from the \
video files, so supported video formats depend on the configuration \
flags of ffmpeg. \
 \
The project also includes a C/C++ library that can be used by \
developers to generate thumbnails in their projects."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "ffmpegthumbnailer-2.2.2-2.6.aarch64.rpm"
RPM_HASH = "0481edba14d872fcf7c6c4b3e18cb65c423d09f7ddd1c090ab1b2880d19f0193a3ca2c059e2e8607b469309ba665d45a9423e495aabe6161332b795584dbbb2b"

RPROVIDES:${PN} += "ffmpegthumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffmpegthumbnailer.so.4 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
