SUMMARY = "Kernel driver for Realtek 802.11ac rtl8812au wifi cards"
DESCRIPTION = "Kernel driver for Realtek 802.11ac 8812au wifi cards \
 \
The sources were obtained from https://github.com/gordboy/rtl8812au, which adaptes the official driver \
released by Realtek to build on recent kernels. \
 \
The previous sources were obtained from https://github.com/morrownr/8812au-20210629, https://github.com/diederikdehaas/rtl8812AU and \
https://github.com/maurossi/rtl8812au/ ."
LICENSE = "GPL-2.0-only"

PV = "5.13.6+git20230722.b5f4e6e_k6.4.11_1"

RPM_NAME = "rtl8812au-kmp-default-5.13.6+git20230722.b5f4e6e_k6.4.11_1-1.3.aarch64.rpm"
RPM_HASH = "159f6c087a776371b621acd7d9bfe5f4ae1cc287d60376a49417eb4fedcfe551b78a1ed7976b0a1b5e5b323415a44d4f1b3694919e872aa0405d46dccc5666f9"

RPROVIDES:${PN} += "kmod-8812au.ko \
multiversion-kernel \
rtl8812au-kmp \
rtl8812au-kmp-default \
rtl8812au-kmp-default-k6.4.11-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
