SUMMARY = "Streaming JSON parser with iterator interface"
DESCRIPTION = "JsonSlicer performs a stream or iterative, pull JSON parsing, which \
means it does not load whole JSON into memory and is able to parse \
very large JSON files or streams. The module is written in C and uses \
YAJL JSON parsing library. \
 \
JsonSlicer takes a path of JSON map keys or array indexes, and \
provides iterator interface which yields JSON data matching \
given path as complete Python objects."
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "python39-jsonslicer-0.1.8-1.6.aarch64.rpm"
RPM_HASH = "03b8928fea8ee4415110c921272c6a099e411eee61890f3f0150afde126e872f5df0a8e2e8ffe6b463c5771675de0aa81eebb23f628db3483218f0dce642b319"

RPROVIDES:${PN} += "python3.9dist-jsonslicer \
python39-jsonslicer \
python3dist-jsonslicer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
