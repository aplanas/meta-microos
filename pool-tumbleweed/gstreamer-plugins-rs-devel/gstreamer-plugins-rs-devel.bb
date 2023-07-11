SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins development files"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new \
plug-ins. \
 \
This package contains the pkgconfig development files for the rust \
plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.6"

RPM_NAME = "gstreamer-plugins-rs-devel-0.10.6-1.3.aarch64.rpm"
RPM_HASH = "5cba60ce00a0748b2ebad8d7f84ef25a9cdb15a652e9c420de8a8c0a5255192d6fb248cba34a1c7c163aeaaabea9c510bc9e12cf542f99df1bf24e8e25eab976"

RPROVIDES:${PN} += "gstreamer-plugins-rs-devel \
pkgconfig-gstaws \
pkgconfig-gstcdg \
pkgconfig-gstclaxon \
pkgconfig-gstdav1d \
pkgconfig-gstfallbackswitch \
pkgconfig-gstffv1 \
pkgconfig-gstfmp4 \
pkgconfig-gstgif \
pkgconfig-gstgtk4 \
pkgconfig-gsthlssink3 \
pkgconfig-gsthsv \
pkgconfig-gstjson \
pkgconfig-gstlewton \
pkgconfig-gstlivesync \
pkgconfig-gstmp4 \
pkgconfig-gstndi \
pkgconfig-gstraptorq \
pkgconfig-gstrav1e \
pkgconfig-gstregex \
pkgconfig-gstreqwest \
pkgconfig-gstrsaudiofx \
pkgconfig-gstrsclosedcaption \
pkgconfig-gstrsfile \
pkgconfig-gstrsflv \
pkgconfig-gstrsonvif \
pkgconfig-gstrspng \
pkgconfig-gstrsrtp \
pkgconfig-gstrstracers \
pkgconfig-gstrsvideofx \
pkgconfig-gstrswebp \
pkgconfig-gstrswebrtc \
pkgconfig-gstsodium \
pkgconfig-gstspotify \
pkgconfig-gsttextahead \
pkgconfig-gsttextwrap \
pkgconfig-gstthreadshare \
pkgconfig-gsttogglerecord \
pkgconfig-gsturiplaylistbin \
pkgconfig-gstwebrtchttp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gstreamer-plugins-rs \
pkgconfig-cairo-gobject \
pkgconfig-dav1d \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-app-1.0 \
pkgconfig-gstreamer-audio-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-net-1.0 \
pkgconfig-gstreamer-rtp-1.0 \
pkgconfig-gstreamer-sdp-1.0 \
pkgconfig-gstreamer-video-1.0 \
pkgconfig-gstreamer-webrtc-1.0 \
pkgconfig-gtk4 \
pkgconfig-libsodium \
pkgconfig-libwebpdemux \
pkgconfig-openssl \
pkgconfig-pango \
pkgconfig-pangocairo"

inherit rpm
