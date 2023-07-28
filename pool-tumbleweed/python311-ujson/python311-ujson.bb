SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.8+"
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python311-ujson-5.8.0-2.1.aarch64.rpm"
RPM_HASH = "44d0574fd025003b2fd3c0cd7b70e3b7fdf350b7591c8eb81898de7ad18c59aabc8c6d4cde3ad35ae55b796277a89341dce37ed59e3479d64b95eb2a60fce40d"

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
