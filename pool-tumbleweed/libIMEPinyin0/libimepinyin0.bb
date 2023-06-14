SUMMARY = "Pinyin library for libime"
DESCRIPTION = "This package provides pinyin library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libIMEPinyin0-1.0.17-1.2.aarch64.rpm"
RPM_HASH = "56ee1127d690cf215ac57cb8979046f2478e0168d2d91ac510ea7b4f5e5eb43f4e96fa81d0c7e562c48447b00aaca4f51bac63439058504fce8e004c22a4139d"

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
