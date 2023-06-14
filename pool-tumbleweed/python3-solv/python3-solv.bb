SUMMARY = "Python3 bindings for the libsolv library"
DESCRIPTION = "Python3 bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "python3-solv-0.7.24-1.1.aarch64.rpm"
RPM_HASH = "d62295cefedbe7c1ce12e7c33930215da2b8f0455949856cc7b10f62d0454e50184b5af9f4034c728ffe173fd6c9d962c184ddc73bb23e5d65941657bee2bb6d"

RPROVIDES:${PN} += "python3-solv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.9 \
librpmio.so.9 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1 \
python-abi"

inherit rpm
