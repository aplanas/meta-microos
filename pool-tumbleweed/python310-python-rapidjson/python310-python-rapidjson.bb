SUMMARY = "Python wrapper around rapidjson"
DESCRIPTION = "RapidJSON is a C++ JSON parser and serialization library. This \
module wraps it into a Python 3 extension, exposing its \
serialization/deserialization (to/from either bytes, str or file-like \
instances) and JSON Schema validation capabilities."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python310-python-rapidjson-1.9-1.7.aarch64.rpm"
RPM_HASH = "a78f5f1b89471f6b156cc0eafb6a21de7c8d2b4298e93294265241e62881eaa45514e5819826322ea8e430ea7834f4470443a69314ee88a22281cbea4f8496fa"

RPROVIDES:${PN} += "python3.10dist-python-rapidjson \
python310-python-rapidjson \
python3dist-python-rapidjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
