SUMMARY = "The Mozc engine for IBus"
DESCRIPTION = "The Mozc engine for IBus provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.28.4715.102"

RPM_NAME = "ibus-mozc-2.28.4715.102-2.1.aarch64.rpm"
RPM_HASH = "94e8aa60f9307f6278473535b08cdb65ab7513930ae4b482ba42b478eb549c7172ed0228023b8cebf985766b261f4a68f1be5e904ca060c6e973d2089017cfc6"

RPROVIDES:${PN} += "ibus-mozc \
locale-ibus-ja"

RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libm.so.6 \
libstdc++.so.6 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
libz.so.1 \
mozc \
mozc-gui-tools"

inherit rpm
