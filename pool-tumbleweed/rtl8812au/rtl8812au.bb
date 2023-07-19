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

RPM_NAME = "rtl8812au-5.13.6+git20230511.765d4e4-1.9.aarch64.rpm"
RPM_HASH = "7894c8f1d668479982d0683e1a345ca313a84bb048a80c1964460eaac29c97d0f6d6d9689a723f2076507d6a94837f382e23f3bc8824cc0dede226ae47e25bfc"

RPROVIDES:${PN} += "rtl8812au"

RDEPENDS:${PN} += ""

inherit rpm
