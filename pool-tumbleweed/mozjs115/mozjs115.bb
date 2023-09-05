SUMMARY = "SpiderMonkey JavaScript library"
DESCRIPTION = "SpiderMonkey is the code-name for Mozilla Firefox's C++ implementation of \
JavaScript. It is intended to be embedded in other applications \
that provide host environments for JavaScript."
LICENSE = "MPL-2.0"

PV = "115.1.0"

RPM_NAME = "mozjs115-115.1.0-1.2.aarch64.rpm"
RPM_HASH = "4b55d4b710fea0442aae09c47dff5c2a2328154a25f8dcce4a52f0aaf39b3b23cdfa3df1b55b5cfc5378fa3f065c897b359a2e22dc29b134b6ac33e1d2a7e151"

RPROVIDES:${PN} += "mozjs115"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
