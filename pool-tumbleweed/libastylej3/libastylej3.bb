SUMMARY = "Java bindings for astyle"
DESCRIPTION = "This package contains Java bindings for astyle."
LICENSE = "MIT"

PV = "3.4"

RPM_NAME = "libastylej3-3.4-1.1.aarch64.rpm"
RPM_HASH = "6ec4a5473afa166da8441faa6aac81348cf2a970a2b6fdbc1e38a260303d701aa98a8d8dfd464aef7152e2994a0c2d886aa9adfb4123d5910472892d96d797b0"

RPROVIDES:${PN} += "libastylej.so.3 \
libastylej3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
