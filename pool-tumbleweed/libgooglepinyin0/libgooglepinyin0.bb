SUMMARY = "A fork from googlepinyin on android"
DESCRIPTION = "libgooglepinyin is an input method fork from google pinyin on android"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "libgooglepinyin0-0.1.2-12.29.aarch64.rpm"
RPM_HASH = "b130047c86851a47eb3ed9097876f6b0a28675c68a220de9fe41e88681557f3fa0af6b27de811f1e89f5f2bfa9cbb5bce26db49908ce5527db379baf4cff5589"

RPROVIDES:${PN} += "libgooglepinyin.so.0 \
libgooglepinyin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
