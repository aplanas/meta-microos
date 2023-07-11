SUMMARY = "UI lxqt-globalkeys libraries"
DESCRIPTION = "UI system libraries for lxqt-globalkeys"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt-globalkeys-ui1-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "bf8a52628fb8db86b6079642dd91215dcea8706eca5afe116a9958cbbfe22cde2636e2664b494194a7ca32b949ad2d9ed6d7f8fd799b8da37cdf746266f7db60"

RPROVIDES:${PN} += "liblxqt-globalkeys-ui.so.1 \
liblxqt-globalkeys-ui1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
liblxqt-globalkeys.so.1 \
libstdc++.so.6"

inherit rpm
