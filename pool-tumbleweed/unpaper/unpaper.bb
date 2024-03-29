SUMMARY = "Post-Processing Tool for Scanned Text Pages"
DESCRIPTION = "The unpaper command line tool helps with post-processing scanned text \
pages, especially with	book pages scanned from photocopies. unpaper \
tries to remove dark edges, corrects the rotation ('deskewing'), and \
aligns the centering of pages."
LICENSE = "GPL-2.0-or-later"

PV = "7.0.0"

RPM_NAME = "unpaper-7.0.0-1.8.aarch64.rpm"
RPM_HASH = "15795bc378e6df0497a1ec7b0ffd316f064a81bd4fde9b8e84462a0c74cb3b5375a987320aef97536699a98b8a796c2d4543c6ed8f6b42ee3d67adafa8037637"

RPROVIDES:${PN} += "unpaper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libm.so.6"

inherit rpm
