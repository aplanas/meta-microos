SUMMARY = "Python binding for Device Tree"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system. \
 \
Python binding part."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "python3-smbus-4.3-2.1.aarch64.rpm"
RPM_HASH = "16431d83636478a9adfb2f47a1051cb71982175d0139d7d681b8568901533be34e749987b7ea50f1a6b403401f5ff56e398f82b1d795a2feda03e9318d11d504"

RPROVIDES:${PN} += "python3-smbus \
python3.11dist-smbus \
python3dist-smbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libi2c.so.0 \
python-abi"

inherit rpm
