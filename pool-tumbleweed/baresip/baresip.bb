SUMMARY = "Modular SIP useragent"
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
 * Control interfaces: JSON-over-TCP."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "baresip-2.10.0-1.9.aarch64.rpm"
RPM_HASH = "7b46e74424208343bfe9dbddd968175a82496400315a8667d0a45cfd92830f6b0fcc5e5efc190428bb072d9ef77dfb8ff37ca81970e6ab7416ebd71bcdcc64c4"

RPROVIDES:${PN} += "baresip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libbaresip.so.2 \
libc.so.6 \
libcodec2.so.1.2 \
libfdk-aac.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjack.so.0 \
libmosquitto.so.1 \
libmp3lame.so.0 \
libmpg123.so.0 \
libopus.so.0 \
libpng16.so.16 \
libportaudio.so.2 \
libpulse-simple.so.0 \
libpulse.so.0 \
libre.so.12 \
libsndfile.so.1 \
libspandsp.so.3 \
libspeexdsp.so.1 \
libtwolame.so.0 \
libwebrtc-audio-processing.so.1"

inherit rpm
