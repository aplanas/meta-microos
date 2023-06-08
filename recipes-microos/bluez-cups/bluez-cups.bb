SUMMARY = "CUPS Driver for Bluetooth Printers"
DESCRIPTION = "Contains the files required by CUPS for printing to Bluetooth-connected \
printers."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-cups-5.66-1.6.aarch64.rpm"
RPM_HASH = "caa8095cf74e9085211b2eff2845fdd75871a0fbeab2b249f9326b7784bb2ac72603c1cee67ecccb2c72ebe1fd27abb21601b13526ca1718adfe54bb7421e712"

RPROVIDES:${PN} += "bluez-cups bluez-cups(aarch-64)"
RDEPENDS:${PN} += "bluez cups ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
