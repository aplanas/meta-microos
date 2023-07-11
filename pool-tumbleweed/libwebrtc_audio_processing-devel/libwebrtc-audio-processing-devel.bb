SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "libwebrtc_audio_processing-devel-0.3.1-1.13.aarch64.rpm"
RPM_HASH = "4c4795e9e5672547d22f6509ee843b6cf2ca628c3900f7a0a4f84be58dd929a3d6459d1ac8a09ee7251c008b895ac2436f0855bb907a23748d1bffd924c75bb7"

RPROVIDES:${PN} += "libwebrtc-audio-processing-devel \
pkgconfig-webrtc-audio-processing"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwebrtc-audio-processing1"

inherit rpm
