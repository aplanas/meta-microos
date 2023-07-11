SUMMARY = "The Mozc engine for IBus"
DESCRIPTION = "The Mozc engine for IBus provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "ibus-mozc-2.29.5111.102-1.1.aarch64.rpm"
RPM_HASH = "4d3a5ccd8b373240a8a311a8bc572c8230b40212f5c66676952197f8022a3a7b86ff719e83047101e530fe628aac1b1555382ab97a665388954311d16d7f8939"

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
