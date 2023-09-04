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

RPM_NAME = "rtl8812au-5.13.6+git20230722.b5f4e6e-1.3.aarch64.rpm"
RPM_HASH = "fecebdc9ec7f4c4fc95e230be2520c5bcb84ce83cb5bd31b718de59b343347dc7daee6214da62dc6d2543a0a4102801da6bb40279df9184c863516e1eca2efd3"

RPROVIDES:${PN} += "rtl8812au"

RDEPENDS:${PN} += ""

inherit rpm
