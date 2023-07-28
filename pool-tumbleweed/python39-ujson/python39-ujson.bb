SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.8+"
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "python39-ujson-5.8.0-2.1.aarch64.rpm"
RPM_HASH = "ea3a7eaab7a24f5402ce1330ae529ab70d394bb1944e9f6ef981386af4b7aa34c96a293be82f39c93fe6c58da9c9a0ea515399f1f9bea4361c184972d6d1170c"

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
