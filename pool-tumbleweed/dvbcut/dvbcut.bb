SUMMARY = "Qt application for cutting parts out of DVB streams"
DESCRIPTION = "DVBcut is a Qt application that allows you to select certain parts of an MPEG \
transport stream (as received via Digital Video Broadcasting, DVB) and save \
these parts into a single MPEG output file. It follows a `keyhole surgery'' \
approach where the input video and audio data is mostly kept unchanged, and \
only very few frames at the beginning and/or end of the selected range are re- \
encoded in order to obtain a valid MPEG file."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "0.7.4"

RPM_NAME = "dvbcut-0.7.4-1.6.aarch64.rpm"
RPM_HASH = "81721de9bd74a9fb7d2682a67b0ed4ba2c64e2b423fad8cfc8efb10f2b017c0ef7a8fa1421cafce4062f589c2b029f643081e467f5f42ee0e8467309d281c8d4"

RPROVIDES:${PN} += "dvbcut"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
liba52.so.0 \
libao.so.4 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmad.so.0 \
libstdc++.so.6 \
libswscale.so.7"

inherit rpm
