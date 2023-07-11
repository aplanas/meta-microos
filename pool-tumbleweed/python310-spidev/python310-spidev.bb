SUMMARY = "Python module for interfacing with SPI devices"
DESCRIPTION = "This package contains the python module for interfacing with SPI devices from user space via the spidev linux kernel driver."
LICENSE = "MIT"

PV = "3.6"

RPM_NAME = "python310-spidev-3.6-1.6.aarch64.rpm"
RPM_HASH = "d7fd8d0f02cf6530e2b0c2fa05b015e05d0524e63807f46f0b402dd325e63fa096d8b01e8da772b134fe8a749783438faa840c37e1d0d0ca98ec911493b3c54b"

RPROVIDES:${PN} += "python3.10dist-spidev \
python310-spidev \
python3dist-spidev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
