SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new \
plug-ins. \
 \
This package provides various plugins written in Rust."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.6"

RPM_NAME = "gstreamer-plugins-rs-0.10.6-1.1.aarch64.rpm"
RPM_HASH = "0170e84e69806095786ddf285eed079b23f7e58e4cd9fcae59cc1f2ac23712bd5206c70b3277df7af93c7ea0179d2fb015173d4c5b9019aa7e261f05796ba675"

RPROVIDES:${PN} += "gstreamer-plugins-rs \
gstreamer1 \
libgstaws.so \
libgstcdg.so \
libgstclaxon.so \
libgstdav1d.so \
libgstfallbackswitch.so \
libgstffv1.so \
libgstfmp4.so \
libgstgif.so \
libgstgtk4.so \
libgsthlssink3.so \
libgsthsv.so \
libgstjson.so \
libgstlewton.so \
libgstlivesync.so \
libgstmp4.so \
libgstndi.so \
libgstraptorq.so \
libgstrav1e.so \
libgstregex.so \
libgstreqwest.so \
libgstrsaudiofx.so \
libgstrsclosedcaption.so \
libgstrsfile.so \
libgstrsflv.so \
libgstrsonvif.so \
libgstrspng.so \
libgstrsrtp.so \
libgstrstracers.so \
libgstrsvideofx.so \
libgstrswebp.so \
libgstrswebrtc.so \
libgstsodium.so \
libgstspotify.so \
libgsttextahead.so \
libgsttextwrap.so \
libgstthreadshare.so \
libgsttogglerecord.so \
libgsturiplaylistbin.so \
libgstwebrtchttp.so"

RDEPENDS:${PN} += "gstreamer \
gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcrypto.so.3 \
libdav1d.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libgstsdp-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgstwebrtc-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libssl.so.3 \
libwebpdemux.so.2"

inherit rpm
