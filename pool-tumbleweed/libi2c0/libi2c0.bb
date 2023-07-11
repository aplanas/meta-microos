SUMMARY = "I2C/SMBus bus access library"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3"

RPM_NAME = "libi2c0-4.3-2.1.aarch64.rpm"
RPM_HASH = "8bd8e8a4209ac2eab739280583ecfe63aa85d5373af31c61cd36bef592ffc3d2a13811b15a52300da8463c2b2b436e0d3ac0db0f648698258e565b37981e4b3f"

RPROVIDES:${PN} += "libi2c.so.0 \
libi2c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
