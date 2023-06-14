SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "libwebrtc_audio_processing1-0.3.1-1.12.aarch64.rpm"
RPM_HASH = "d5a97bfbb21fb7bcf08d26299b0d98fd31f32ea8370e80508ef6c8ae046bcfa283ca70ff980067b52714a4d510dd8180d5ec27487c8ee6bd7c0895a18aad1e7e"

RPROVIDES:${PN} += "libwebrtc-audio-processing.so.1 \
libwebrtc-audio-processing1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
