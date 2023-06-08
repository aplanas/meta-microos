SUMMARY = "I2C Serial EEPROM Programming Tool for the WCH CH341A"
DESCRIPTION = "An I2C serial EEPROM programming tool for cheap Winchiphead CH341 IC based programmers."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "ch341eepromtool-0.5-1.2.aarch64.rpm"
RPM_HASH = "89075e854b8e8d4d18f3d744890b81d4727d0fd4f8ecc8f5754bc4a6b61a262469e13bb4e4fce01a92ec5954784ce05a332a16b84a00eaaa82af85069dcb101a"

RPROVIDES:${PN} += "ch341eepromtool ch341eepromtool(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
