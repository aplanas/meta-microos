SUMMARY = "SpiderMonkey JavaScript library"
DESCRIPTION = "SpiderMonkey is the code-name for Mozilla Firefox's C++ implementation of \
JavaScript. It is intended to be embedded in other applications \
that provide host environments for JavaScript."
LICENSE = "MPL-2.0"

PV = "78.15.0"

RPM_NAME = "mozjs78-78.15.0-2.8.aarch64.rpm"
RPM_HASH = "4b3c30d2a62502f8bc4e8301c9c4054c815f9118d1ed2685e3b5bec601431fa28619eecdc8bd16ebc14ff353a41d526c45edcdb47172fa24309cf430bc5add99"

RPROVIDES:${PN} += "mozjs78"

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
