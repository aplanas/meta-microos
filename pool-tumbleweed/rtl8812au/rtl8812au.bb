SUMMARY = "Kernel driver for Realtek 802.11ac 8812au wifi cards"
DESCRIPTION = "Kernel driver for Realtek 802.11ac 8812au wifi cards \
 \
The sources were obtained from https://github.com/morrownr/8812au-20210629, which adaptes the official driver \
released by Realtek to build on recent kernels. \
 \
The previous sources were obtained from https://github.com/morrownr/8812au-20210629, https://github.com/diederikdehaas/rtl8812AU and \
https://github.com/maurossi/rtl8812au/ ."
LICENSE = "GPL-2.0-only"

PV = "5.13.6+git20230511.765d4e4"

RPM_NAME = "rtl8812au-5.13.6+git20230511.765d4e4-1.8.aarch64.rpm"
RPM_HASH = "682c51535f9ce9261f04ff9fe358fad30ec77ff3824103a0e6f98bd1c49c9b76ba97ed0b6f16da1c38fd38fc8c7a0bedcf67fca8b5c06c5a61587fc7edd05540"

RPROVIDES:${PN} += "rtl8812au"

RDEPENDS:${PN} += ""

inherit rpm
