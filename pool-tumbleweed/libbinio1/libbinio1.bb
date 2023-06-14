SUMMARY = "Binary I/O Stream Class Library"
DESCRIPTION = "The binary I/O stream class library presents a platform-independent way to \
access binary data streams in C++. It transparently converts between \
machine-internal binary data representation and can be used on arbitrary \
binary data sources."
LICENSE = "LGPL-2.1-only"

PV = "1.5"

RPM_NAME = "libbinio1-1.5-1.2.aarch64.rpm"
RPM_HASH = "9aae8ce531f82187c02c1d96399cc20ccc322159f20583ce175396fd0a5a60230bb4540b447be007507217ff1e8a6170a3949ebe9c20c21619a7298b9bd6aa73"

RPROVIDES:${PN} += "libbinio.so.1 \
libbinio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
