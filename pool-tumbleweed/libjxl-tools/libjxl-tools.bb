SUMMARY = "Command-line utilities to convert from/to JPEG XL"
DESCRIPTION = "Command-line utilities to convert from/to JPEG XL."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "libjxl-tools-0.8.1-3.1.aarch64.rpm"
RPM_HASH = "7c3827756511ab2ebe13380c4fb163d6e8a16952a91020135204a1753d2abed1a0dde6985e42e7a780009c0ba87b51281e761b1660c3c2e623b54311d628264f"

RPROVIDES:${PN} += "libjxl-tools \
libjxl-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbrotlidec.so.1()(64bit) \
libbrotlienc.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhwy.so.1()(64bit) \
libhwy.so.1(HWY_0)(64bit) \
libjpeg.so.8()(64bit) \
libjxl.so.0.8()(64bit) \
libjxl.so.0.8(JXL_0)(64bit) \
libjxl_threads.so.0.8()(64bit) \
libjxl_threads.so.0.8(JXL_0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
