SUMMARY = "Plymouth 'space-flares' plugin"
DESCRIPTION = "This package contains the 'space-flares' boot splash plugin for \
Plymouth. It features a corner image with animated flares."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-space-flares-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "c8646dd3a3d2ae2ff3336f6a7ce7d493b04a5f379f9c7c20cb8f7a90f8c3ea5c79274d702b25a209411faf9ff46beb746661158ce9816db0bb1e154de8261247"

RPROVIDES:${PN} += "plymouth-plugin-space-flares \
plymouth-plugin-space-flares(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libply-splash-core.so.5()(64bit) \
libply-splash-core5 \
libply-splash-graphics.so.5()(64bit) \
libply-splash-graphics5 \
libply.so.5()(64bit) \
libply5 \
plymouth-plugin-label"

inherit rpm
