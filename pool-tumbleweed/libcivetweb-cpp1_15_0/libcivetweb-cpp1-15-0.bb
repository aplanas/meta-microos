SUMMARY = "Shared Object for applications that use civetweb embedded"
DESCRIPTION = "This package contains the shared library required by applications that \
are using civetweb's embeddable API to provide web services."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libcivetweb-cpp1_15_0-1.16-1.1.aarch64.rpm"
RPM_HASH = "5c5f407d38bd4891e3baad93894af9e8b8cf6fac50bc061494e491e4cc5ca46ee98d2168f66fa4288012e96d04593b5f8ef368f13d32f95db2e331b5175505fd"

RPROVIDES:${PN} += "libcivetweb-cpp.so.1.15.0 \
libcivetweb-cpp1-15-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcivetweb.so.1.15.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
