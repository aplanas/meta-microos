SUMMARY = "Video cutter that uses FFmpeg and GTK+"
DESCRIPTION = "CutterFF is a program for cutting videos using FFmpeg and GTK+. \
It does not decode/encode the streams, it only copies them. \
 \
Features \
 - Selecting which streams written to the output \
 - Selecting the format and bitstream filters \
 - Choose a program if video contains more than one \
 - Set cutpoints everywhere in the video \
 - Many formats and codecs supported by FFmpeg \
 - Log window for displaying FFmpeg messages"
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "cutterff-1.0.2-1.6.aarch64.rpm"
RPM_HASH = "c9da0938bb77b8662290fceaa96244fa7b185a5f05e8c38699b39cbc406212945429ebfbe310c915b7c673c880ef3f1334eccefdee0552a013872c5f09b248bf"

RPROVIDES:${PN} += "cutterff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libswscale.so.7"

inherit rpm
