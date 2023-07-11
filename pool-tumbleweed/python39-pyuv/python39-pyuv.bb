SUMMARY = "Python interface for libuv"
DESCRIPTION = "Python interface for libuv."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-pyuv-1.4.0-6.1.aarch64.rpm"
RPM_HASH = "b9b45873eecad6c123dd20b6078eb755f08368003c40b9077105262d3e1ab2cfd83fe603bcfa7718966851b7aa0b9d467cedadfdefa2ea44cee8164ba5b23456"

RPROVIDES:${PN} += "python3.9dist-pyuv \
python39-pyuv \
python3dist-pyuv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm
