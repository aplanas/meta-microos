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

RPM_NAME = "rtl8812au-kmp-64kb-5.13.6+git20230722.b5f4e6e_k6.4.11_1-1.3.aarch64.rpm"
RPM_HASH = "80a0a063f619d2f305983c31776f51c984078a1dbf4fd8a2b6ea65166d53e59df0cbfc11c6e50ea93611a18708c96005259da01afe7da28cb895c6eda212fede"

RPROVIDES:${PN} += "kmod-8812au.ko \
multiversion-kernel \
rtl8812au-kmp \
rtl8812au-kmp-64kb \
rtl8812au-kmp-64kb-k6.4.11-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
