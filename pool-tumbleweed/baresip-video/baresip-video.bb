SUMMARY = "Video support for the Baresip useragent"
DESCRIPTION = "A modular SIP user-agent \
with support for audio and video, and many IETF standards \
such as SIP, SDP, RTP/RTCP, STUN, TURN, and ICE. \
 \
Supports both IPv4 and IPv6, and the following features. \
 * Audio codecs: AMR, G.711, G.722, G.726, GSM, L16, MPA, OPUS. \
 * Video codecs: H.263, H.264, H.265, MPEG4, VP8, VP9. \
 * Audio drivers: Alsa, JACK, OSS, Portaudio, sndio. \
 * Video sources: FFmpeg avformat, Video4Linux2, X11 Grabber. \
 * Video output: SDL2, X11, DirectFB. \
 * NAT Traversal: STUN, TURN, ICE, NATBD, NAT-PMP, PCP. \
 * Media encryption: SRTP, DTLS-SRTP. \
 * DNS Service Discovery: Avahi. \
 * Telemetry messaging: MQTT. \
 * Control interfaces: JSON-over-TCP. \
 \
This subpackage provides the modules that are needed for video \
support."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "baresip-video-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "612396603255d43708b9b8124f5c691a1677ed72ddbf8c6095961d98e8e09a947349bb42ac1a1f1031b91795031728fefe8254f5db3ed77ea5ab9bd1a04d01c1"

RPROVIDES:${PN} += "baresip-video"

RDEPENDS:${PN} += "baresip \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXext.so.6 \
libaom.so.3 \
libavcodec.so.60 \
libavdevice.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libglib-2.0.so.0 \
libgstreamer-1.0.so.0 \
libswresample.so.4 \
libswscale.so.7 \
libvpx.so.8"

inherit rpm
