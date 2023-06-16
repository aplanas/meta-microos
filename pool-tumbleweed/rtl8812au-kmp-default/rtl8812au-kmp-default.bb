SUMMARY = "Kernel driver for Realtek 802.11ac rtl8812au wifi cards"
DESCRIPTION = "Kernel driver for Realtek 802.11ac 8812au wifi cards \
 \
The sources were obtained from https://github.com/gordboy/rtl8812au, which adaptes the official driver \
released by Realtek to build on recent kernels. \
 \
The previous sources were obtained from https://github.com/morrownr/8812au-20210629, https://github.com/diederikdehaas/rtl8812AU and \
https://github.com/maurossi/rtl8812au/ ."
LICENSE = "GPL-2.0-only"

PV = "5.13.6+git20230511.765d4e4_k6.3.4_1"

RPM_NAME = "rtl8812au-kmp-default-5.13.6+git20230511.765d4e4_k6.3.4_1-1.2.aarch64.rpm"
RPM_HASH = "5c48ec4da832201bd1e5433db88dc5c93464b591c51a685b467dd39a18368e517d1baa8d452f83830a01d0b1cc8ecaf637b3bfe8afc66f77ec2b006a5e4a2c5a"

RPROVIDES:${PN} += "kmod-8812au.ko \
multiversion-kernel \
rtl8812au-kmp \
rtl8812au-kmp-default \
rtl8812au-kmp-default-k6.3.4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
