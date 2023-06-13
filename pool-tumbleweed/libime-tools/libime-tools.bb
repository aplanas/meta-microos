SUMMARY = "Toolkit for libime"
DESCRIPTION = "This package provides toolkit for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libime-tools-1.0.17-1.2.aarch64.rpm"
RPM_HASH = "c2c501f4b360b8a47fb9fe229eadbc4a1b09f4a6245358a0a1c0e22ab4e5643d2816852e6637762858af89efa3f39bca98dd39b1acb0eb4d5bec6028c736ec72"

RPROVIDES:${PN} += "libime-tools \
libime-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libIMECore.so.0()(64bit) \
libIMEPinyin.so.0()(64bit) \
libIMETable.so.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
