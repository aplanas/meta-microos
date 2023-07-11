SUMMARY = "Python module for interfacing with SPI devices"
DESCRIPTION = "This package contains the python module for interfacing with SPI devices from user space via the spidev linux kernel driver."
LICENSE = "MIT"

PV = "3.6"

RPM_NAME = "python311-spidev-3.6-1.6.aarch64.rpm"
RPM_HASH = "0fb2aa4dfd6f2e638db8b27f2c86b9f17ef3c4c2311b20aede645adbb7ba5fc8416282e6ab6a0bc3b1d57750f23bcafa4dfe98363aa5df0a8ef5ac0006b75132"

RPROVIDES:${PN} += "python3-spidev \
python3.11dist-spidev \
python311-spidev \
python3dist-spidev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
