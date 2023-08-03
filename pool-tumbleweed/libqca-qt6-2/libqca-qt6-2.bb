SUMMARY = "QCA library"
DESCRIPTION = "The Qt cryptographic library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.7"

RPM_NAME = "libqca-qt6-2-2.3.7-1.1.aarch64.rpm"
RPM_HASH = "6eff8dbbcdbb8defd798231dd554f621120974fd26935f563d63b196276aa83c3deed967a06c98fe62645b66f62743900a6fa6fce21b4f7cc6f12f6f40bbd396"

RPROVIDES:${PN} += "libqca-qt6-2 \
libqca-qt6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qca-qt6"

inherit rpm
