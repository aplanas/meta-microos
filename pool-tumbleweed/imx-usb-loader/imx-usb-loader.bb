SUMMARY = "Vybrid/i.MX recovery utility"
DESCRIPTION = "This utility allows to download and execute code on Freescale i.MX5/i.MX6 and Vybrid SoCs through the Serial Download Protocol (SDP). Depending on the board, there is usually some kind of recovery button to bring the SoC into serial download boot mode, check documentation of your hardware. \
 \
The utility support USB and UART as serial link."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2~git20180504"

RPM_NAME = "imx-usb-loader-0.2~git20180504-1.20.aarch64.rpm"
RPM_HASH = "a34cbcda0d44ab92dba76e0bd9d88dc4fa6a82278a8afddec5ca9eb639fd542b20f3c7a428d88b82ccfaf53efba5b0c987358f25d161813a1d05165eb0d7193e"

RPROVIDES:${PN} += "config-imx-usb-loader \
imx-usb-loader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
