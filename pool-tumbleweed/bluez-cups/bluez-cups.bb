SUMMARY = "CUPS Driver for Bluetooth Printers"
DESCRIPTION = "Contains the files required by CUPS for printing to Bluetooth-connected \
printers."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-cups-5.66-1.8.aarch64.rpm"
RPM_HASH = "32f8bbae1667917fc46785aaaed2004e72b35590d0a4c25aa9efc78df9f84cd1edf526e472db5e5a6412b50e12adb5efe2e494c15d6967037b45b0b09c17fa98"

RPROVIDES:${PN} += "bluez-cups"

RDEPENDS:${PN} += "bluez \
cups \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0"

inherit rpm
