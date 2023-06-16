SUMMARY = "Tool to control an usb-sd-mux from the command line"
DESCRIPTION = "Tool to control USB-SD-mux hardware from linux-automation.com \
 \
Full manual is available at https://www.linux-automation.com/usbsdmux-M01/"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "python39-usbsdmux-0.2.1-1.7.aarch64.rpm"
RPM_HASH = "5aa11c61f1981be7ab5ac74030cebadd3cb5de641e75c51cada3e0d0ea0bd80027eac45f9ad6064875cd4783e3fcc9b8d2b532e35b47d35a6b4432328aa6ce2b"

RPROVIDES:${PN} += "python3.9dist-usbsdmux \
python39-usbsdmux \
python3dist-usbsdmux"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives \
usbsdmux-udev"

inherit rpm
