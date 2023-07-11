SUMMARY = "Tool to control an usb-sd-mux from the command line"
DESCRIPTION = "Tool to control USB-SD-mux hardware from linux-automation.com \
 \
Full manual is available at https://www.linux-automation.com/usbsdmux-M01/"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "python39-usbsdmux-0.2.1-1.9.aarch64.rpm"
RPM_HASH = "50eca31a8bfb51d01107b51a2513b869c376099b36ac80ab2dfe997ec532dcab0cf63dcf50f3032e7e9c38af551412778953633e67f9342ff3b8332fc671fa1f"

RPROVIDES:${PN} += "python3.9dist-usbsdmux \
python39-usbsdmux \
python3dist-usbsdmux"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives \
usbsdmux-udev"

inherit rpm
