SUMMARY = "Java bindings for astyle"
DESCRIPTION = "This package contains Java bindings for astyle."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "libastylej3-3.3.1-1.1.aarch64.rpm"
RPM_HASH = "9ad521779a8f3d86cb29f523d2ce35311d43e185f8f07c8a1b3d83fa7d9fd4f9f0a69d33cc01c78ec5acc7c9e54d5e8029721c6f6fbedd0240b49c572a8bd965"

RPROVIDES:${PN} += "libastylej.so.3 \
libastylej3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
