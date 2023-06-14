SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "libprotobuf-lite3_21_12-21.12-3.2.aarch64.rpm"
RPM_HASH = "b3a41ac896e0fb6299efa3858f7133e14fbb400229675e53efd7c48c38f176e7bac1cb950dc0757940790a4cadb560cbaf7a84c213f4fd8eec040efda6b73839"

RPROVIDES:${PN} += "libprotobuf-lite-3.21.12.so \
libprotobuf-lite3-21-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
