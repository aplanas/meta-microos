SUMMARY = "SpiderMonkey JavaScript library"
DESCRIPTION = "SpiderMonkey is the code-name for Mozilla Firefox's C++ implementation of \
JavaScript. It is intended to be embedded in other applications \
that provide host environments for JavaScript."
LICENSE = "MPL-2.0"

PV = "102.12.0"

RPM_NAME = "mozjs102-102.12.0-1.1.aarch64.rpm"
RPM_HASH = "d10305204fa89aae05dba426e462580fd17bcc48994ac7ea321556a88ef3fd95d22553ffb56005737e7b9fd17363222b1a28c1ef1bbc98c6f03636451a5ad157"

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
