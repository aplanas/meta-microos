SUMMARY = "Python module for interfacing with SPI devices"
DESCRIPTION = "This package contains the python module for interfacing with SPI devices from user space via the spidev linux kernel driver."
LICENSE = "MIT"

PV = "3.6"

RPM_NAME = "python311-spidev-3.6-1.4.aarch64.rpm"
RPM_HASH = "6066a08126423923653b993b8ea8d381066d83953c262becb1f6cd5b0b40de0f70b178f263b79068cce294ae51db265695ed27b2dbdb442fe07294b6d293a8f5"

RPROVIDES:${PN} += "python3.11dist(spidev) \
python311-spidev \
python311-spidev(aarch-64) \
python3dist(spidev)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
