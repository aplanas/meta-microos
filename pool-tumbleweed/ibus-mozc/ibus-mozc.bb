SUMMARY = "The Mozc engine for IBus"
DESCRIPTION = "The Mozc engine for IBus provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "ibus-mozc-2.29.5111.102-2.1.aarch64.rpm"
RPM_HASH = "65453c41783079b803fbaeb5fb3699bd6c50960afb34a56f001b555e4d1b3a7e19ee5cf4c6b695015f7aedbfda2a4b239d05752513df82244251819516fef415"

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
