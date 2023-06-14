SUMMARY = "Audio filtering library made from WebRTC code"
DESCRIPTION = "An audio filtering library made from webrtc code. \
 \
This package provides shared libraries for filter_audio."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "libfilteraudio0-0.0.1-2.14.aarch64.rpm"
RPM_HASH = "57aa2c0a045a3dfd33feb454264e3dc942c3140c33c70350ab0b3c7139f48437aec347e58e34054e217aa42c7c91eb0a33efc58ca79176d9a586b1a48ddb0590"

RPROVIDES:${PN} += "libfilteraudio.so.0 \
libfilteraudio0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
