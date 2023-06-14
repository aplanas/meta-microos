SUMMARY = "Udev rules for usbsdmux"
DESCRIPTION = "Udev rules for usbsdmux"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "usbsdmux-udev-0.2.1-1.7.aarch64.rpm"
RPM_HASH = "ceefc492c9af805d091af8f3afb6aa6d049562e6f0ae0ade4de6a09ab80568a94ff72d4817b079914f9640f89d4f48b3bad50b1d8cc1cc42e9a1821ba156a8e1"

RPROVIDES:${PN} += "usbsdmux-udev"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
