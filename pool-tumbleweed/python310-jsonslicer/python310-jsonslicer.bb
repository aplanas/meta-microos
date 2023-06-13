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

RPM_NAME = "python310-jsonslicer-0.1.8-1.4.aarch64.rpm"
RPM_HASH = "e484b1cfdca6107232dd6eaf5758c652abfca2909dced04f9c741e317007dd9584709df267af0d96ac20a64a7fba3802e8f323704375994b3bcc1924b075dbfc"

RPROVIDES:${PN} += "python3-jsonslicer \
python3.10dist(jsonslicer) \
python310-jsonslicer \
python310-jsonslicer(aarch-64) \
python3dist(jsonslicer)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libyajl.so.2()(64bit) \
python(abi)"

inherit rpm
