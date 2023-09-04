SUMMARY = "Tools to work with Apple Keynote presentations"
DESCRIPTION = "This package contains tools to work with Apple Keynote presentations"
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-tools-0.1.10-2.1.aarch64.rpm"
RPM_HASH = "16c3571ba272bf2b2f5fc41b62122215fd4712d33ffc1a147d132dddebe32f25706f99fb79c629c6f433254266f575d9045b0f7a0a1a86209ad97481663bbe70"

RPROVIDES:${PN} += "libetonyek-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libetonyek-0.1.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm
