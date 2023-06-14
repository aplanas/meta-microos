SUMMARY = "Toolkit for libime"
DESCRIPTION = "This package provides toolkit for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libime-tools-1.0.17-1.2.aarch64.rpm"
RPM_HASH = "c2c501f4b360b8a47fb9fe229eadbc4a1b09f4a6245358a0a1c0e22ab4e5643d2816852e6637762858af89efa3f39bca98dd39b1acb0eb4d5bec6028c736ec72"

RPROVIDES:${PN} += "libime-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libIMEPinyin.so.0 \
libIMETable.so.0 \
libboost-iostreams.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
