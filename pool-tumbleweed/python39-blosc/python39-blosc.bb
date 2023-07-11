SUMMARY = "Blosc data compressor for Python"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data in \
Python."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "python39-blosc-1.11.1-2.2.aarch64.rpm"
RPM_HASH = "3aa188b0517552dbcbe916b938f71bd7511733d60f559cd9685883dc91db6bf81580e69a80713765b81b01aa20aec6105d09a2c343e4877a5531ddbfa2c5dddc"

RPROVIDES:${PN} += "python3.9dist-blosc \
python39-blosc \
python3dist-blosc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
python-abi"

inherit rpm
