SUMMARY = "Python binding for Device Tree"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system. \
 \
Python binding part."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "python3-smbus-4.3-1.7.aarch64.rpm"
RPM_HASH = "db578a3a2387f54b0e5cef6fc46db5b4db01ebfa344373e863afaa7381628b860c195dbdc1281cd8261d3f247ccb44489ae8b44b5cef774a119cc8a12e0ddf65"

RPROVIDES:${PN} += "python3-smbus \
python3-smbus(aarch-64) \
python3.10dist(smbus) \
python3dist(smbus)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libi2c.so.0()(64bit) \
python(abi)"

inherit rpm
