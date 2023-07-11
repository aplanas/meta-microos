SUMMARY = "Tool to control an usb-sd-mux from the command line"
DESCRIPTION = "Tool to control USB-SD-mux hardware from linux-automation.com \
 \
Full manual is available at https://www.linux-automation.com/usbsdmux-M01/"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "python311-usbsdmux-0.2.1-1.9.aarch64.rpm"
RPM_HASH = "8e53c8f6d0e09c6eed9c762341f6cd9de7561b07e00f1de586a03192f146d03f7cd2dfa9170e844b37c70f4503d2c5e42796d4faa1f23ba4ffdbedf09af5c529"

RPROVIDES:${PN} += "python3-usbsdmux \
python3.11dist-usbsdmux \
python311-usbsdmux \
python3dist-usbsdmux"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives \
usbsdmux-udev"

inherit rpm
