SUMMARY = "LeechCraft Azoth Emoticon pack support"
DESCRIPTION = "This package provides an emoticons plugin for LeechCraft Azoth which \
permits to use emoticon packs which are stored in Psi+, Kopete \
format or Azoth format."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-nativeemoticons-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "540d7e663df03454867e4d53311d95d9247f8e592d0cb8402e686d87550317ad9ad3762f55f6e0cf30849df45014ff7b8e1d9339a6b982d6a4db6b1395a9207c"

RPROVIDES:${PN} += "leechcraft-azoth-nativeemoticons \
libleechcraft-azoth-nativeemoticons.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
