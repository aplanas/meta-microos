SUMMARY = "Kernel driver for Realtek 802.11ac rtl8812au wifi cards"
DESCRIPTION = "Kernel driver for Realtek 802.11ac 8812au wifi cards \
 \
The sources were obtained from https://github.com/gordboy/rtl8812au, which adaptes the official driver \
released by Realtek to build on recent kernels. \
 \
The previous sources were obtained from https://github.com/morrownr/8812au-20210629, https://github.com/diederikdehaas/rtl8812AU and \
https://github.com/maurossi/rtl8812au/ ."
LICENSE = "GPL-2.0-only"

PV = "5.13.6+git20230722.b5f4e6e_k6.4.12_1"

RPM_NAME = "rtl8812au-kmp-64kb-5.13.6+git20230722.b5f4e6e_k6.4.12_1-1.4.aarch64.rpm"
RPM_HASH = "208777230c4528e2dc1e53a33fc098960d28db86bb4b62f7a36639c271fe7f2cb4421e68038997fa707a615f3d7db11ec8ce33283274fe19f390ac18b052f606"

RPROVIDES:${PN} += "kmod-8812au.ko \
multiversion-kernel \
rtl8812au-kmp \
rtl8812au-kmp-64kb \
rtl8812au-kmp-64kb-k6.4.12-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
