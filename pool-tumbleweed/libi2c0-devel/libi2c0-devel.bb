SUMMARY = "Development files for the I2C/SMBus bus access library"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3"

RPM_NAME = "libi2c0-devel-4.3-2.1.aarch64.rpm"
RPM_HASH = "b3ae017c9f8bd13674df54ff5e9885babbc00daade822513f5822aebc0955cc4b9c2794f6bb1650e25712da4b15cbb49745c1cce4f0b7e52f17a4d9be4a09946"

RPROVIDES:${PN} += "/usr/include/i2c/smbus.h \
libi2c0-devel"

RDEPENDS:${PN} += "glibc-devel \
libi2c0"

inherit rpm
