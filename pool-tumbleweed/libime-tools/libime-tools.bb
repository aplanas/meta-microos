SUMMARY = "Toolkit for libime"
DESCRIPTION = "This package provides toolkit for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libime-tools-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "df7a9d7031771242687c3e40fcfa5dcc270ac7b43617f627029ee1fa87bf381e652149a1143e00b21b68b7fa30687b42a8c213cf234ca7fcf9dff40e0881ec6a"

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
