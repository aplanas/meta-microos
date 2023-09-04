SUMMARY = "Libthai input method engine for Fcitx5"
DESCRIPTION = "fcitx-libthai is an input method engine for Fcitx, which uses libthai as its backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-libthai-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "6c316185c8e63ece93f9112a30cd06a0bd4f0ef5255bc5d210751daa291419888debfd55094238005f0dacf348cb272514899778875e831e045bf60654a3a9bf"

RPROVIDES:${PN} += "fcitx5-libthai \
libthai.so"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libthai-data \
libthai.so.0"

inherit rpm
