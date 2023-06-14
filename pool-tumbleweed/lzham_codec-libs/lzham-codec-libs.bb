SUMMARY = "Lossless data compression codec"
DESCRIPTION = "Libraries for encoding/decoding lzham codec files."
LICENSE = "MIT"

PV = "1_0_stable1"

RPM_NAME = "lzham_codec-libs-1_0_stable1-2.19.aarch64.rpm"
RPM_HASH = "bdbcb682c5a37b888491b8f87895aee0f7ee2020b2fefafffdfdc092f556a4b203310fb86c570fb42714e70fb661cf1a2331a330c229f2cbb9f62abc7b7843db"

RPROVIDES:${PN} += "liblzhamcomp.so \
liblzhamdecomp.so \
liblzhamdll.so \
lzham-codec-libs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
