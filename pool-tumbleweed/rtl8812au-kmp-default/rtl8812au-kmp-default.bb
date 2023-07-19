SUMMARY = "Kernel driver for Realtek 802.11ac rtl8812au wifi cards"
DESCRIPTION = "Kernel driver for Realtek 802.11ac 8812au wifi cards \
 \
The sources were obtained from https://github.com/gordboy/rtl8812au, which adaptes the official driver \
released by Realtek to build on recent kernels. \
 \
The previous sources were obtained from https://github.com/morrownr/8812au-20210629, https://github.com/diederikdehaas/rtl8812AU and \
https://github.com/maurossi/rtl8812au/ ."
LICENSE = "GPL-2.0-only"

PV = "5.13.6+git20230511.765d4e4_k6.4.3_1"

RPM_NAME = "rtl8812au-kmp-default-5.13.6+git20230511.765d4e4_k6.4.3_1-1.9.aarch64.rpm"
RPM_HASH = "33f2216af4bc0f4193a5f9c16d9c99f50ba26a3040f1a445114e44e4e052c84fce28387cc04c4efc05bb61eddfad100cc0f97e14ad492d8773165a77c60ef960"

RPROVIDES:${PN} += "kmod-8812au.ko \
multiversion-kernel \
rtl8812au-kmp \
rtl8812au-kmp-default \
rtl8812au-kmp-default-k6.4.3-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
