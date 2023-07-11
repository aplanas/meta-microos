SUMMARY = "The Mozc backend for Fcitx"
DESCRIPTION = "The Mozc backend for Fcitx provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "fcitx-mozc-2.29.5111.102-1.1.aarch64.rpm"
RPM_HASH = "4ef151754ce26247e56f7fbf2f3283e17111b50c401d642477bfcad8d63ecc2e2179d380567a9f389adc72ead9d966f7690f9610590106f01da6e603484c95f2"

RPROVIDES:${PN} += "fcitx-mozc \
locale-fcitx-ja"

RDEPENDS:${PN} += "fcitx \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-core.so.0 \
libfcitx-utils.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
mozc \
mozc-gui-tools"

inherit rpm
