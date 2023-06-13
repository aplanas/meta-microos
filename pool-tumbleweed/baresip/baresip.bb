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

RPM_NAME = "baresip-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "96fa48cab5b17d75ee6d85f15ba8ec7eaf6f938d8931116629acf0491a649e5ff129050aa5e40d86c1b031198c6cafb1541c9390b6a513f3f4ecba6ea414b9f0"

RPROVIDES:${PN} += "baresip \
baresip(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libbaresip.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcodec2.so.1.1()(64bit) \
libfdk-aac.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjack.so.0()(64bit) \
libmosquitto.so.1()(64bit) \
libmp3lame.so.0()(64bit) \
libmpg123.so.0()(64bit) \
libopus.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libportaudio.so.2()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libre.so.12()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libspandsp.so.3()(64bit) \
libspeexdsp.so.1()(64bit) \
libtwolame.so.0()(64bit) \
libwebrtc_audio_processing.so.1()(64bit)"

inherit rpm
