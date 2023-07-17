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

PV = "0.10.9"

RPM_NAME = "gstreamer-plugins-rs-devel-0.10.9-1.1.aarch64.rpm"
RPM_HASH = "df5718a66387e75b390337fd8c095cae51b44a5ba2e96ccf94a5457c6a219c430d039fd8b7fa10569b7291768b592bb54d5f6fac48d0b92dd9d1c9a16b88b2c2"

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
