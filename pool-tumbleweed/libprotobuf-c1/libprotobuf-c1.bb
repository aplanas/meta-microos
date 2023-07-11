SUMMARY = "C bindings for Google's Protocol Buffers"
DESCRIPTION = "This package provides a code generator and runtime libraries to use Protocol \
Buffers from pure C (not C++)."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "libprotobuf-c1-1.4.1-5.1.aarch64.rpm"
RPM_HASH = "28e8443970142062895fa0c9cf9ab16a0fe7419242b861d7e69752a228d46a4a2e0aceef1e119266735359119f9028bde9e8e20cd7363253770ba963c789ff6e"

RPROVIDES:${PN} += "libprotobuf-c.so.1 \
libprotobuf-c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
