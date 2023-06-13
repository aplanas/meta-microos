SUMMARY = "Wrapper library around libffmpeg"
DESCRIPTION = "FFmpegSource (usually known as FFMS or FFMS2) is a wrapper \
library around FFmpeg, plus some additional components to deal with file \
formats libavformat has (or used to have) problems with."
LICENSE = "MIT"

PV = "2.40+44"

RPM_NAME = "ffmsindex-2.40+44-1.5.aarch64.rpm"
RPM_HASH = "2b4cedfd86c8f37c1c218cc91f7e55ea0a18636a0d60826ab1c300ef9c8150fdd1eb014bed22e3c4c6fff690e5dbeef05318188e8d3fc301b8ad4f0f87fd059c"

RPROVIDES:${PN} += "ffmsindex \
ffmsindex(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libffms2.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
