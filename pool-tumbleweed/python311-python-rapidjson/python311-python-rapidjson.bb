SUMMARY = "Python wrapper around rapidjson"
DESCRIPTION = "RapidJSON is a C++ JSON parser and serialization library. This \
module wraps it into a Python 3 extension, exposing its \
serialization/deserialization (to/from either bytes, str or file-like \
instances) and JSON Schema validation capabilities."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python311-python-rapidjson-1.9-1.5.aarch64.rpm"
RPM_HASH = "a41c3140314288a12ee3dfb379bcca695c2fce9428d2d5a0f8a8a4e1685fa1230fabd7c9a819871d937d4675f926c5d7804e3983eb78b102477bc1f95d8c7fa9"

RPROVIDES:${PN} += "python3.11dist(python-rapidjson) \
python311-python-rapidjson \
python311-python-rapidjson(aarch-64) \
python3dist(python-rapidjson)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
