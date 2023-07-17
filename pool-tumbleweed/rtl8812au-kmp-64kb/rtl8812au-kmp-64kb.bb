SUMMARY = "Kernel driver for Realtek 802.11ac rtl8812au wifi cards"
DESCRIPTION = "Kernel driver for Realtek 802.11ac 8812au wifi cards \
 \
The sources were obtained from https://github.com/gordboy/rtl8812au, which adaptes the official driver \
released by Realtek to build on recent kernels. \
 \
The previous sources were obtained from https://github.com/morrownr/8812au-20210629, https://github.com/diederikdehaas/rtl8812AU and \
https://github.com/maurossi/rtl8812au/ ."
LICENSE = "GPL-2.0-only"

PV = "5.13.6+git20230511.765d4e4_k6.4.2_1"

RPM_NAME = "rtl8812au-kmp-64kb-5.13.6+git20230511.765d4e4_k6.4.2_1-1.8.aarch64.rpm"
RPM_HASH = "dcd9f1554d7db3e255d8e80bf9a285da9ffccefd61f7881c6f8f6b14909ee874d8a473b63def4509eda0d043a390ea52a0d6822aa6f2e7d24f74436330ada237"

RPROVIDES:${PN} += "kmod-8812au.ko \
multiversion-kernel \
rtl8812au-kmp \
rtl8812au-kmp-64kb \
rtl8812au-kmp-64kb-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
