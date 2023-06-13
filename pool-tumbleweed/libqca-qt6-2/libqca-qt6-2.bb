SUMMARY = "QCA library"
DESCRIPTION = "The Qt cryptographic library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "libqca-qt6-2-2.3.6-1.1.aarch64.rpm"
RPM_HASH = "21c9fa7c1337cb2c55494bc8d0b78fb24521105b86d09ce648f5624c45a9ed1a514202a3abb5561e7ba200739642b4e2a8e80cf1b3aa9cb6e27492a154435740"

RPROVIDES:${PN} += "libqca-qt6-2 \
libqca-qt6-2(aarch-64) \
libqca-qt6.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core5Compat.so.6()(64bit) \
libQt6Core5Compat.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
qca-qt6"

inherit rpm
