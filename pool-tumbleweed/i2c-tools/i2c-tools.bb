SUMMARY = "A heterogeneous set of I2C tools for Linux"
DESCRIPTION = "This package contains a heterogeneous set of I2C tools for Linux: a bus \
probing tool, a chip dumper, register-level access helpers, EEPROM \
decoding scripts, and more."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "i2c-tools-4.3-3.1.aarch64.rpm"
RPM_HASH = "812b51e38cda3e74f157ca22d097bc0cd19a685841c1d3a57b404dbbfde882c2214327e8fa71a392815c63d2f23408d070d314425aafb53a89dc00bdaf17c883"

RPROVIDES:${PN} += "i2c-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libi2c.so.0 \
udev"

inherit rpm
