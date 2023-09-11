SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-base-1.22.5-3.1.aarch64.rpm"
RPM_HASH = "d77068a73f926747ccbf55ed53c2fe62cc4e8e9df1d7485f4a8afcb00cddafc56fb02d49b3e949a030bc3ccedb4dc9e87fbc13a0e98349970741dd708216cbd7"

RPROVIDES:${PN} += "gst-plugins-base \
gstreamer-plugins-base \
gstreamer1 \
libgstadder.so \
libgstalsa.so \
libgstapp.so \
libgstaudioconvert.so \
libgstaudiomixer.so \
libgstaudiorate.so \
libgstaudioresample.so \
libgstaudiotestsrc.so \
libgstcdparanoia.so \
libgstcompositor.so \
libgstencoding.so \
libgstgio.so \
libgstlibvisual.so \
libgstogg.so \
libgstopengl.so \
libgstopus.so \
libgstoverlaycomposition.so \
libgstpango.so \
libgstpbtypes.so \
libgstplayback.so \
libgstrawparse.so \
libgstsubparse.so \
libgsttcp.so \
libgsttheora.so \
libgsttypefindfunctions.so \
libgstvideoconvertscale.so \
libgstvideorate.so \
libgstvideotestsrc.so \
libgstvolume.so \
libgstvorbis.so \
libgstximagesink.so \
libgstxvimagesink.so"

RDEPENDS:${PN} += "gstreamer \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXv.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libcdda-interface.so.0 \
libcdda-paranoia.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstallocators-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstriff-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libogg.so.0 \
libopus.so.0 \
liborc-0.4.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libtheoradec.so.1 \
libtheoraenc.so.1 \
libvisual-0.4.so.0 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
