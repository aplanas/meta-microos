SUMMARY = "SpiderMonkey JavaScript library"
DESCRIPTION = "SpiderMonkey is the code-name for Mozilla Firefox's C++ implementation of \
JavaScript. It is intended to be embedded in other applications \
that provide host environments for JavaScript."
LICENSE = "MPL-2.0"

PV = "115.2.0"

RPM_NAME = "mozjs115-115.2.0-1.1.aarch64.rpm"
RPM_HASH = "39369632df16a23271ce22267b1fec3e71aa0cdb9e71df027f313f1628d46f5a96745392d0f963a97541d88da0195dbe8591f5ef949e40ef105d952bf1ac4668"

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
