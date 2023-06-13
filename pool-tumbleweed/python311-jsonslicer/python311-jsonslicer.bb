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

RPM_NAME = "python311-jsonslicer-0.1.8-1.4.aarch64.rpm"
RPM_HASH = "a0ce939ae3615ef8961b9c4e78c1cf90d5fcef57cd328cd824a10f6cd33bdfe01f37dbaefcaf207af2d65dafdc72a67381013ab30c935439d2ce0e86e94634a0"

RPROVIDES:${PN} += "python3.11dist(jsonslicer) \
python311-jsonslicer \
python311-jsonslicer(aarch-64) \
python3dist(jsonslicer)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libyajl.so.2()(64bit) \
python(abi)"

inherit rpm
