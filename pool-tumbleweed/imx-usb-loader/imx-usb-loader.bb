SUMMARY = "Vybrid/i.MX recovery utility"
DESCRIPTION = "This utility allows to download and execute code on Freescale i.MX5/i.MX6 and Vybrid SoCs through the Serial Download Protocol (SDP). Depending on the board, there is usually some kind of recovery button to bring the SoC into serial download boot mode, check documentation of your hardware. \
 \
The utility support USB and UART as serial link."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2~git20180504"

RPM_NAME = "imx-usb-loader-0.2~git20180504-1.19.aarch64.rpm"
RPM_HASH = "39cdbd38a409818c1625d61308612af0683e44ea8e12ef885c6dd7e97975a15afd9ab9f0c0a315ca369f688f36ef541de5905a0ebf01a1d165e378b97d421478"

RPROVIDES:${PN} += "config(imx-usb-loader) \
imx-usb-loader \
imx-usb-loader(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
