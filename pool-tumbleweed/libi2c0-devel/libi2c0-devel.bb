SUMMARY = "Development files for the I2C/SMBus bus access library"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3"

RPM_NAME = "libi2c0-devel-4.3-3.1.aarch64.rpm"
RPM_HASH = "0534d45abc5faccf931798b35c8e4d92ccd99e6674f4eeaf6916f307e1cc06c64e78896863f0e715b547d8525f88edd2229465c4d18fb3eef43116cdfc865c79"

RPROVIDES:${PN} += "/usr/include/i2c/smbus.h \
libi2c0-devel"

RDEPENDS:${PN} += "glibc-devel \
libi2c0"

inherit rpm
