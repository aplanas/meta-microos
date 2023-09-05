SUMMARY = "Kernel driver for Realtek 802.11ac 8812au wifi cards"
DESCRIPTION = "Kernel driver for Realtek 802.11ac 8812au wifi cards \
 \
The sources were obtained from https://github.com/morrownr/8812au-20210629, which adaptes the official driver \
released by Realtek to build on recent kernels. \
 \
The previous sources were obtained from https://github.com/morrownr/8812au-20210629, https://github.com/diederikdehaas/rtl8812AU and \
https://github.com/maurossi/rtl8812au/ ."
LICENSE = "GPL-2.0-only"

PV = "5.13.6+git20230722.b5f4e6e"

RPM_NAME = "rtl8812au-5.13.6+git20230722.b5f4e6e-1.4.aarch64.rpm"
RPM_HASH = "bfada985030b578532200e11f46f47421e79c2d4d94d06ab1cf858f79986dc1bc7290c1273ca0504fb87b84478eaf48c6664a8ab47f2c276d8ecc37437ec90a2"

RPROVIDES:${PN} += "rtl8812au"

RDEPENDS:${PN} += ""

inherit rpm
