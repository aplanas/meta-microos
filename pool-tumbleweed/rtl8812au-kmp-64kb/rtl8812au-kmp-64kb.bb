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

RPM_NAME = "rtl8812au-kmp-64kb-5.13.6+git20230511.765d4e4_k6.3.4_1-1.2.aarch64.rpm"
RPM_HASH = "f2de25d1919d1282460d4a2ea58011ad3e68cee457e6bd834d2dda6721208427a9198d952b095586f59cfdb0322f3440eb899f00e607e69ec0b69ef494b245a2"

RPROVIDES:${PN} += "kmod(8812au.ko) \
multiversion(kernel) \
rtl8812au-kmp \
rtl8812au-kmp-64kb \
rtl8812au-kmp-64kb(aarch-64) \
rtl8812au-kmp-64kb-k6.3.4_1"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
