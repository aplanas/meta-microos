SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "libwebrtc_audio_processing-devel-static-0.3.1-1.13.aarch64.rpm"
RPM_HASH = "e5a7dec36dc62fdca3404fabf4d4cb95b12e623d0675b2137effd40cc8bab89ec8b3d08bb06afc8afbac57238dd6caf0e9e37f230bfb28dbe6042f3b2691dfcb"

RPROVIDES:${PN} += "libwebrtc-audio-processing-devel-static"

RDEPENDS:${PN} += "libwebrtc-audio-processing-devel"

inherit rpm
