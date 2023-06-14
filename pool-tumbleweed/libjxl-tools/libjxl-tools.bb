SUMMARY = "Command-line utilities to convert from/to JPEG XL"
DESCRIPTION = "Command-line utilities to convert from/to JPEG XL."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "libjxl-tools-0.8.1-3.1.aarch64.rpm"
RPM_HASH = "7c3827756511ab2ebe13380c4fb163d6e8a16952a91020135204a1753d2abed1a0dde6985e42e7a780009c0ba87b51281e761b1660c3c2e623b54311d628264f"

RPROVIDES:${PN} += "libjxl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhwy.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
