SUMMARY = "SpiderMonkey JavaScript library"
DESCRIPTION = "SpiderMonkey is the code-name for Mozilla Firefox's C++ implementation of \
JavaScript. It is intended to be embedded in other applications \
that provide host environments for JavaScript."
LICENSE = "MPL-2.0"

PV = "102.15.0"

RPM_NAME = "mozjs102-102.15.0-1.1.aarch64.rpm"
RPM_HASH = "fc8c2d354799627413bc06b7e4034c80c19a0e707f4ecab1a0e39f70a093b0a7ed6f25c502728681ce78a76f09524e57606447fe0d3554481d4d8f75116f893f"

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
