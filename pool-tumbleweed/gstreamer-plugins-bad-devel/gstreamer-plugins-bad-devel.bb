SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-bad-devel-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "139cdf7c604de2d594a5aceeb0b89c30896eef84d9eb517b879c1c7cf18b352068246a1f880c7ee58fe424b51b0df481ee0db567568807e27e817a5dacf58535"

RPROVIDES:${PN} += "gstreamer-plugins-bad-devel \
pkgconfig-gstreamer-bad-audio-1.0 \
pkgconfig-gstreamer-codecparsers-1.0 \
pkgconfig-gstreamer-cuda-1.0 \
pkgconfig-gstreamer-insertbin-1.0 \
pkgconfig-gstreamer-mpegts-1.0 \
pkgconfig-gstreamer-photography-1.0 \
pkgconfig-gstreamer-play-1.0 \
pkgconfig-gstreamer-player-1.0 \
pkgconfig-gstreamer-plugins-bad-1.0 \
pkgconfig-gstreamer-sctp-1.0 \
pkgconfig-gstreamer-va-1.0 \
pkgconfig-gstreamer-vulkan-1.0 \
pkgconfig-gstreamer-vulkan-wayland-1.0 \
pkgconfig-gstreamer-vulkan-xcb-1.0 \
pkgconfig-gstreamer-wayland-1.0 \
pkgconfig-gstreamer-webrtc-1.0 \
pkgconfig-gstreamer-webrtc-nice-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gstreamer-plugins-bad \
gstreamer-plugins-bad-fluidsynth \
libgstadaptivedemux-1-0-0 \
libgstbadaudio-1-0-0 \
libgstbasecamerabinsrc-1-0-0 \
libgstcodecparsers-1-0-0 \
libgstcodecs-1-0-0 \
libgstcuda-1-0-0 \
libgstinsertbin-1-0-0 \
libgstisoff-1-0-0 \
libgstmpegts-1-0-0 \
libgstphotography-1-0-0 \
libgstplay-1-0-0 \
libgstplayer-1-0-0 \
libgstsctp-1-0-0 \
libgsttranscoder-1-0-0 \
libgsturidownloader-1-0-0 \
libgstva-1-0-0 \
libgstvulkan-1-0-0 \
libgstwayland-1-0-0 \
libgstwebrtc-1-0-0 \
libgstwebrtcnice-1-0-0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-allocators-1.0 \
pkgconfig-gstreamer-audio-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-gl-prototypes-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-gstreamer-play-1.0 \
pkgconfig-gstreamer-sdp-1.0 \
pkgconfig-gstreamer-tag-1.0 \
pkgconfig-gstreamer-video-1.0 \
pkgconfig-gstreamer-vulkan-1.0 \
pkgconfig-gstreamer-webrtc-1.0 \
pkgconfig-libdrm \
pkgconfig-libva \
pkgconfig-libva-drm \
pkgconfig-nice \
pkgconfig-vulkan \
pkgconfig-wayland-client \
pkgconfig-wayland-protocols \
pkgconfig-xcb \
pkgconfig-xkbcommon \
pkgconfig-xkbcommon-x11 \
typelib-1-0-CudaGst-1-0 \
typelib-1-0-GstBadAudio-1-0 \
typelib-1-0-GstCodecs-1-0 \
typelib-1-0-GstCuda-1-0 \
typelib-1-0-GstInsertBin-1-0 \
typelib-1-0-GstMpegts-1-0 \
typelib-1-0-GstPlay-1-0 \
typelib-1-0-GstPlayer-1-0 \
typelib-1-0-GstVa-1-0 \
typelib-1-0-GstWebRTC-1-0"

inherit rpm
