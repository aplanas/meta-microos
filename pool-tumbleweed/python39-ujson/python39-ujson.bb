SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.8+"
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python39-ujson-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "37e22c39127f33a085ed9f42f5a27a619680899a52f86c0db9d6c146f9e814c70e3225a59117d55ae0254087ddf14470901cb20ebc6e69c5b6ca0e6afaf9f5d6"

RPROVIDES:${PN} += "python3.9dist-ujson \
python39-ujson \
python3dist-ujson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdouble-conversion.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
