SUMMARY = "A fork from googlepinyin on android"
DESCRIPTION = "libgooglepinyin is an input method fork from google pinyin on android"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "libgooglepinyin0-0.1.2-12.28.aarch64.rpm"
RPM_HASH = "2f3f36f186006937d5288fa455f45899c667f9ca7ba869c9e858da3d0471ae04fd07ac92ebcc1c8e66988edc38633c848f74e79127a263e35e8c80ce74fbc508"

RPROVIDES:${PN} += "libgooglepinyin.so.0()(64bit) \
libgooglepinyin0 \
libgooglepinyin0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
