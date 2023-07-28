SUMMARY = "Python binding for Device Tree"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system. \
 \
Python binding part."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "python3-smbus-4.3-3.1.aarch64.rpm"
RPM_HASH = "0b2870a0e3db2bcfa411fac08b2b2db02566138d5fe6603b85eaf79b42d1fdb1b282c12f521a20a9692d5a76a58dce7330ebad8bc2f42015f8061f82695dd537"

RPROVIDES:${PN} += "python3-smbus \
python3.11dist-smbus \
python3dist-smbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libi2c.so.0 \
python-abi"

inherit rpm
