SUMMARY = "The Mozc backend for Fcitx"
DESCRIPTION = "The Mozc backend for Fcitx provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "fcitx-mozc-2.29.5111.102-2.1.aarch64.rpm"
RPM_HASH = "368218349b44e5639905e811937494fbbf389811bfbe897d3abca61c86fb7caf0dd104973b8b80e2a7c92c2df24c157b54ea98d68933b51cf4356c5526761c26"

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
