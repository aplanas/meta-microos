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

RPM_NAME = "python311-jsonslicer-0.1.8-1.6.aarch64.rpm"
RPM_HASH = "4262ba2be1aa17bab2b893859112b99771ba1bd470fc5601ab96efb20314161efd417648341d5dd0f4b0a42c27d0e651fefa25415e11efdfe4930a5787f1344f"

RPROVIDES:${PN} += "python3-jsonslicer \
python3.11dist-jsonslicer \
python311-jsonslicer \
python3dist-jsonslicer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
