SUMMARY = "Tool to control an usb-sd-mux from the command line"
DESCRIPTION = "Tool to control USB-SD-mux hardware from linux-automation.com \
 \
Full manual is available at https://www.linux-automation.com/usbsdmux-M01/"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "python311-usbsdmux-0.2.1-1.7.aarch64.rpm"
RPM_HASH = "1c2fc8265c2c35958b94b96730c0cd02d4a304e81fabefaae1d10efaaa32b8376f4e35856b734b1f4d87b12d86abe98bf70c9d28b8deb0946bd876b6ccb928f4"

RPROVIDES:${PN} += "python3.11dist(usbsdmux) \
python311-usbsdmux \
python311-usbsdmux(aarch-64) \
python3dist(usbsdmux)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives \
usbsdmux-udev"

inherit rpm
