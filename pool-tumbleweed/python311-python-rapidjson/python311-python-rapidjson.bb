SUMMARY = "Python wrapper around rapidjson"
DESCRIPTION = "RapidJSON is a C++ JSON parser and serialization library. This \
module wraps it into a Python 3 extension, exposing its \
serialization/deserialization (to/from either bytes, str or file-like \
instances) and JSON Schema validation capabilities."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python311-python-rapidjson-1.9-1.7.aarch64.rpm"
RPM_HASH = "b479dc4610550e335586f4d4deb55a8f6df32715afc8fda47ab900c1f3e73a6c5ae7158712ec912acdad77b8bcbeb0bd29b985db9b6b53e112eec9117ce0af83"

RPROVIDES:${PN} += "python3-python-rapidjson \
python3.11dist-python-rapidjson \
python311-python-rapidjson \
python3dist-python-rapidjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
