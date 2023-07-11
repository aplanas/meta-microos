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

RPM_NAME = "python310-jsonslicer-0.1.8-1.6.aarch64.rpm"
RPM_HASH = "b63893dcf2d2774bd71dabadefbfa867b4fbde12a0b05506a547606f7cc1afce2b72e18592191ce8e240420ef8c7052887d4e49780672ea4bad5c0c5daffa028"

RPROVIDES:${PN} += "python3.10dist-jsonslicer \
python310-jsonslicer \
python3dist-jsonslicer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
