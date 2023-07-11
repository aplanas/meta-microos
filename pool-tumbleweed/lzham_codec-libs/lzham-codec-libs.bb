SUMMARY = "Lossless data compression codec"
DESCRIPTION = "Libraries for encoding/decoding lzham codec files."
LICENSE = "MIT"

PV = "1_0_stable1"

RPM_NAME = "lzham_codec-libs-1_0_stable1-2.20.aarch64.rpm"
RPM_HASH = "82c3f4222f5b8ce5d3615f83f6f88fa1efccd20f95c3c2202d4681a9f238297a03a8659a5307d17dba295514d1265216470812cf5afd308f44f23a7964226bfd"

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
