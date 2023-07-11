SUMMARY = "A heterogeneous set of I2C tools for Linux"
DESCRIPTION = "This package contains a heterogeneous set of I2C tools for Linux: a bus \
probing tool, a chip dumper, register-level access helpers, EEPROM \
decoding scripts, and more."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "i2c-tools-4.3-2.1.aarch64.rpm"
RPM_HASH = "22faff8d95c6f439b303a042581e501aa70b57615f55aa3b6b386eb3924352a555bd012fa9e4506d73474de0d25daac6ad9a9bbb611fda454b550347fd20a950"

RPROVIDES:${PN} += "i2c-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libi2c.so.0 \
udev"

inherit rpm
