SUMMARY = "JSON parser library written in ANSI C"
DESCRIPTION = "A simple JSON parser library written in ANSI C."
LICENSE = "MIT"

PV = "1.7.16"

RPM_NAME = "libcjson1-1.7.16-1.1.aarch64.rpm"
RPM_HASH = "447a34a75352ef99fee299f688399d42513012a359f4ee14f9cc97c56e32fef586880356560ba2ed0613c323afcb98a03baf2b544d3a30e97bc4be556f246ba3"

RPROVIDES:${PN} += "libcjson.so.1 \
libcjson1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
