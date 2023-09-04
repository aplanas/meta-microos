SUMMARY = "SpiderMonkey JavaScript library"
DESCRIPTION = "SpiderMonkey is the code-name for Mozilla Firefox's C++ implementation of \
JavaScript. It is intended to be embedded in other applications \
that provide host environments for JavaScript."
LICENSE = "MPL-2.0"

PV = "102.14.0"

RPM_NAME = "mozjs102-102.14.0-1.1.aarch64.rpm"
RPM_HASH = "2a07739c32ed3cebc88f4a9fba63cf0c4b898f2d8a5e15adec47c6ed2c7b8ed9457647197358223b040323e813828452826a273cf4c14569fe942492bd5d7f79"

RPROVIDES:${PN} += "mozjs102"

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
