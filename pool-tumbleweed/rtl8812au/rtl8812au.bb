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

RPM_NAME = "rtl8812au-5.13.6+git20230511.765d4e4-1.7.aarch64.rpm"
RPM_HASH = "f1a33be73bd0f37661a99c4e001e83726fe3b041fc7d4cb8f95f4a7f3e39bb9df154056714e41f4104cde5648999f180990503fa5075c267a15bf22d661bf406"

RPROVIDES:${PN} += "rtl8812au"

RDEPENDS:${PN} += ""

inherit rpm
