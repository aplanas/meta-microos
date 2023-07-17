SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.8+"
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python311-ujson-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "ace0cfe248684c4e583f35dedeab39c9c52e46337610ccf8515d1298a0662cd43df9bd95f70c67fab8f746144ac481b54abe37e9c0bb31ad78677685752ad7e4"

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
