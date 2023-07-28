SUMMARY = "I2C/SMBus bus access library"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3"

RPM_NAME = "libi2c0-4.3-3.1.aarch64.rpm"
RPM_HASH = "9573542c91b352a871c50875f05f055e945e8fa62f3e7a6b95e09a2e2c1cf724d5d7386000fa0171860c829dee240ab9fa98c5f13e4e9e3e315735149f32209d"

RPROVIDES:${PN} += "libi2c.so.0 \
libi2c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
