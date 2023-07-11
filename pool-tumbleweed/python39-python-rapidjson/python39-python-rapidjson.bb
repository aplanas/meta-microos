SUMMARY = "Python wrapper around rapidjson"
DESCRIPTION = "RapidJSON is a C++ JSON parser and serialization library. This \
module wraps it into a Python 3 extension, exposing its \
serialization/deserialization (to/from either bytes, str or file-like \
instances) and JSON Schema validation capabilities."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python39-python-rapidjson-1.9-1.7.aarch64.rpm"
RPM_HASH = "3750737dc19edbcd6c8d4720b7e5a3267dd127ead25661ad115a4d54432d820264bc30bb213b52a1bd5e2b9e26c7b453e1a9998403b773b9d2dab3b80abb4626"

RPROVIDES:${PN} += "python3.9dist-python-rapidjson \
python39-python-rapidjson \
python3dist-python-rapidjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
