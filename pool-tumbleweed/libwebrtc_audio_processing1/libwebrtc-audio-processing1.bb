SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "libwebrtc_audio_processing1-0.3.1-1.13.aarch64.rpm"
RPM_HASH = "d71f30dae53c35975af94e6d8a0147fe0eb2d9ea3fc55851fecfb3521769ef87027721b2185b2162a323e3845debcaebada0653049f905ef1dd11a2f3f6867c7"

RPROVIDES:${PN} += "libwebrtc-audio-processing.so.1 \
libwebrtc-audio-processing1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
