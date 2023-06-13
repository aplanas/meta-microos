SUMMARY = "I2C/SMBus bus access library"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3"

RPM_NAME = "libi2c0-4.3-1.7.aarch64.rpm"
RPM_HASH = "e69aba41a9150575012eccebf1d460f72e8333ae19d5eac979ecff3b5dc9d4b142a401a2aecf5ad22286beba23bc55a98836647d349b00203769804878b9ac90"

RPROVIDES:${PN} += "libi2c.so.0()(64bit) \
libi2c0 \
libi2c0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
