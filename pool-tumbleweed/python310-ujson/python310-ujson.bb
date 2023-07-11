SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.5+"
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python310-ujson-5.7.0-2.3.aarch64.rpm"
RPM_HASH = "6a2391cf86fa4f7b26d8f5ad5ca1398f52688bb23b6987281bdbdddd5abe6329d60a155857bb78352a959b0dd6bcbdfe59ca2031bb0de0cdac530729882de5ed"

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
