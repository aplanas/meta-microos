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

RPM_NAME = "rtl8812au-kmp-default-5.13.6+git20230511.765d4e4_k6.4.2_1-1.8.aarch64.rpm"
RPM_HASH = "09afd65faa850f30e0fc81589a71c1308aa5764dc94042314be765ca7cfdeee514a15182e6890f7a1b9f83eedb5e248f56185c91e17152c032304d0dac09efe4"

RPROVIDES:${PN} += "kmod-8812au.ko \
multiversion-kernel \
rtl8812au-kmp \
rtl8812au-kmp-default \
rtl8812au-kmp-default-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
