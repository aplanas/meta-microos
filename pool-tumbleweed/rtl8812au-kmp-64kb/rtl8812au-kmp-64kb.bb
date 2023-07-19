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

RPM_NAME = "rtl8812au-kmp-64kb-5.13.6+git20230511.765d4e4_k6.4.3_1-1.9.aarch64.rpm"
RPM_HASH = "e4003bfcb14f46636c449805536493f4a8deecab7e74eee0b6509f33d3f2af58b8e7911062dd7edafbf0414a62e1979360e7f2dc78cfa9c06e8d4bbc0edb0f78"

RPROVIDES:${PN} += "kmod-8812au.ko \
multiversion-kernel \
rtl8812au-kmp \
rtl8812au-kmp-64kb \
rtl8812au-kmp-64kb-k6.4.3-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
