SUMMARY = "Udev rules for usbsdmux"
DESCRIPTION = "Udev rules for usbsdmux"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "usbsdmux-udev-0.2.1-1.9.aarch64.rpm"
RPM_HASH = "c480a05d0c8cedfd4fdb1a2e972eb00eb349f82998fce8047fc597115d09f5dcbcd20662e92898241a4d5817840f891404dedbacb1f870f9a87cb03f466e585e"

RPROVIDES:${PN} += "usbsdmux-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
