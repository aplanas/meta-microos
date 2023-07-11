SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.5+"
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python311-ujson-5.7.0-2.3.aarch64.rpm"
RPM_HASH = "7db3545d5ecad58383bc4aedd40c2c6d21633649d3fd5eb7500b6c40c24666b18fc292fe6841ecd092a4ce187afc99d1853662c8a7428ebbba3c0e61e50592d5"

RPROVIDES:${PN} += "python3-ujson \
python3.11dist-ujson \
python311-ujson \
python3dist-ujson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdouble-conversion.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
