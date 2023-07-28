SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.8+"
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python310-ujson-5.8.0-2.1.aarch64.rpm"
RPM_HASH = "7a0e8a3e9501ee9dcb9e12030c1e4e4bc943b9873d6528dd7b63504f9b537e54d7fd5d3dfbcee8a9600721060f7d6d4dcbc927ae9a92001d95a55caaca96a1b9"

RPROVIDES:${PN} += "python3.10dist-ujson \
python310-ujson \
python3dist-ujson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdouble-conversion.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
