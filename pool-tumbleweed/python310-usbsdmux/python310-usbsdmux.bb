SUMMARY = "Tool to control an usb-sd-mux from the command line"
DESCRIPTION = "Tool to control USB-SD-mux hardware from linux-automation.com \
 \
Full manual is available at https://www.linux-automation.com/usbsdmux-M01/"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "python310-usbsdmux-0.2.1-1.9.aarch64.rpm"
RPM_HASH = "2c62ca95d3309993c17e3fc100310a66655ee061012c6819f1728e887411bfe2390e3207656e86fdd6eb34f5484eb1e4acdd8e46d07b41c28fe4c0720fc85935"

RPROVIDES:${PN} += "python3.10dist-usbsdmux \
python310-usbsdmux \
python3dist-usbsdmux"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives \
usbsdmux-udev"

inherit rpm
