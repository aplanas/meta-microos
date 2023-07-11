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

RPM_NAME = "ffmpegthumbnailer-2.2.2-2.7.aarch64.rpm"
RPM_HASH = "611422608edbf82d09d38995590ac242511ad5665d756ce8d86daae18d545f12a3f2bf30059ba520c202da34fcd64c2e3c14f02376a8e15fb737695f1ac48f49"

RPROVIDES:${PN} += "ffmpegthumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffmpegthumbnailer.so.4 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
