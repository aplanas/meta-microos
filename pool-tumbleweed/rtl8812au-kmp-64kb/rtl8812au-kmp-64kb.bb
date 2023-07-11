SUMMARY = "Kernel driver for Realtek 802.11ac rtl8812au wifi cards"
DESCRIPTION = "Kernel driver for Realtek 802.11ac 8812au wifi cards \
 \
The sources were obtained from https://github.com/gordboy/rtl8812au, which adaptes the official driver \
released by Realtek to build on recent kernels. \
 \
The previous sources were obtained from https://github.com/morrownr/8812au-20210629, https://github.com/diederikdehaas/rtl8812AU and \
https://github.com/maurossi/rtl8812au/ ."
LICENSE = "GPL-2.0-only"

PV = "5.13.6+git20230511.765d4e4_k6.3.9_1"

RPM_NAME = "rtl8812au-kmp-64kb-5.13.6+git20230511.765d4e4_k6.3.9_1-1.7.aarch64.rpm"
RPM_HASH = "6b59a7e0fccb97a8d98d305ab478fa673fcb867488da570400cf13c6eb3dbbcacaeb290249d4348a69233a98a66da639d22ecbdaa5980edfc980b6886b5dbcf0"

RPROVIDES:${PN} += "kmod-8812au.ko \
multiversion-kernel \
rtl8812au-kmp \
rtl8812au-kmp-64kb \
rtl8812au-kmp-64kb-k6.3.9-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
