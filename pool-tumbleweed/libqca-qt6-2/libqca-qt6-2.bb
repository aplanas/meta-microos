SUMMARY = "QCA library"
DESCRIPTION = "The Qt cryptographic library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "libqca-qt6-2-2.3.6-1.2.aarch64.rpm"
RPM_HASH = "c8a2027089fd610f1b0e19e4e81ae7b8b9b6129440f30ade77eec979f100fa8d6420afd9969874e0c80b46a0f98549934f26b49aa1f997bcbff7a4bc9fc8e95a"

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
