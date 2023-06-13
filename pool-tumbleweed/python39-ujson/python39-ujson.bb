SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.5+"
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python39-ujson-5.7.0-1.2.aarch64.rpm"
RPM_HASH = "88b333f94eae37a3f940d63cf4596f5badaac4cd7536bcaef4a5b260d807be56b8647438dbaaa69ef8711dc9e8e21ae8151208e31e7fdb7a13d3ce75ed760e1b"

RPROVIDES:${PN} += "python3.9dist(ujson) \
python39-ujson \
python39-ujson(aarch-64) \
python3dist(ujson)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdouble-conversion.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
