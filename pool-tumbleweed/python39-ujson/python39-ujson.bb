SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.5+"
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python39-ujson-5.7.0-2.3.aarch64.rpm"
RPM_HASH = "6edf855548cd091b9943afefbb016d3e3739d375828349f553b780cb34adbffbca1e67bcfcbdacb4cb0478883e743907a1ffef129a6971aa0ef895d12a598951"

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
