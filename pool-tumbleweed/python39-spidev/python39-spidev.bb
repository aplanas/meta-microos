SUMMARY = "Python module for interfacing with SPI devices"
DESCRIPTION = "This package contains the python module for interfacing with SPI devices from user space via the spidev linux kernel driver."
LICENSE = "MIT"

PV = "3.6"

RPM_NAME = "python39-spidev-3.6-1.6.aarch64.rpm"
RPM_HASH = "6fa92a9fc90ea1d3905479740ed19b36c19bf55e236616256a27559ec86ed10e6c1e97e82cc02afce1097aa6ff2afd48ddc609ebd2673f81a23ff2fb302e284f"

RPROVIDES:${PN} += "python3.9dist-spidev \
python39-spidev \
python3dist-spidev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
