SUMMARY = "A library to detect the natural language of text"
DESCRIPTION = "A library that detects over 80 languages in UTF-8 text, based largely \
on groups of four letters. Also tables for 160+ language versions."
LICENSE = "Apache-2.0"

PV = "20150820"

RPM_NAME = "libcld2-0-20150820-5.9.aarch64.rpm"
RPM_HASH = "6429eaccbc3d23ce968b76ba461df3b6c2b8bcd34d157016a130dee748466c824892f0cf59f55ce28b0435eb09a536077bf98f68edc1e139b62bb6f9433d3b5f"

RPROVIDES:${PN} += "libcld2-0 \
libcld2-0(aarch-64) \
libcld2.so.0()(64bit) \
libcld2_dynamic.so.0()(64bit) \
libcld2_full.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
