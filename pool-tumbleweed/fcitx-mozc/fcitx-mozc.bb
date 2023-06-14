SUMMARY = "The Mozc backend for Fcitx"
DESCRIPTION = "The Mozc backend for Fcitx provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.28.4715.102"

RPM_NAME = "fcitx-mozc-2.28.4715.102-2.1.aarch64.rpm"
RPM_HASH = "79eeeb79c699d559713a085626b2957616652c2a0223bebcaa15bcc51dc954821ee8ab4b774c91cea646f9b9ede2c3cbd2efbd03fde912f71f363156c3941c99"

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
