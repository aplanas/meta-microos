SUMMARY = "Python module for interfacing with SPI devices"
DESCRIPTION = "This package contains the python module for interfacing with SPI devices from user space via the spidev linux kernel driver."
LICENSE = "MIT"

PV = "3.6"

RPM_NAME = "python39-spidev-3.6-1.4.aarch64.rpm"
RPM_HASH = "075b8f3394fa987f2d7a2552fffe5de9c884a1f422dbeee31a99ee0bc106a5c964fe57898e3ecf1bd4efcc44c2692752276599a7bd661dd074575d69837c853f"

RPROVIDES:${PN} += "python3.9dist(spidev) \
python39-spidev \
python39-spidev(aarch-64) \
python3dist(spidev)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
