SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "libwebrtc_audio_processing-devel-static-0.3.1-1.12.aarch64.rpm"
RPM_HASH = "64fb9b51825e26d20a9cffcc22e6461801443aadabd511d1793b4e8d1e3805dd48ef2d070f89e0aeba6bd654fa0a2da14679e258d4fd9f2db7969521769091d0"

RPROVIDES:${PN} += "libwebrtc-audio-processing-devel-static"

RDEPENDS:${PN} += "libwebrtc-audio-processing-devel"

inherit rpm
