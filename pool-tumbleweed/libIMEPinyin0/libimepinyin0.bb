SUMMARY = "Pinyin library for libime"
DESCRIPTION = "This package provides pinyin library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libIMEPinyin0-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "2cf92d1ae68da04d46e4b97092117cca1ae0496e0b67254a639f8626f742a4f60bb1ce27144a04672d38ec16fff251d6e9781c44ebd719adbfbbd1e7a5177618"

RPROVIDES:${PN} += "libIMEPinyin.so.0 \
libIMEPinyin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libime-dicts \
libstdc++.so.6"

inherit rpm
