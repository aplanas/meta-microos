SUMMARY = "Binary I/O Stream Class Library"
DESCRIPTION = "The binary I/O stream class library presents a platform-independent way to \
access binary data streams in C++. It transparently converts between \
machine-internal binary data representation and can be used on arbitrary \
binary data sources."
LICENSE = "LGPL-2.1-only"

PV = "1.5"

RPM_NAME = "libbinio1-1.5-1.3.aarch64.rpm"
RPM_HASH = "2fecb3e4d001ed1352817abd9756e31090fde27a64d6d634af7256ca6d48eee2cde2111fefa4148aa58af36a835c50cbd2f33ab7dd10ccbbd5b135fd43a9c434"

RPROVIDES:${PN} += "libbinio.so.1 \
libbinio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
