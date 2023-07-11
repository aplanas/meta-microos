SUMMARY = "Shared Object for applications that use civetweb embedded"
DESCRIPTION = "This package contains the shared library required by applications that \
are using civetweb's embeddable API to provide web services."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libcivetweb-cpp1_15_0-1.16-1.2.aarch64.rpm"
RPM_HASH = "4adf110191888de445adf250647cb9964d168676ac9c3a2a39627f839eb7d3e35f9c68d34202868fad0fccdbd2303bba7769f97f0f8c8df5fe0093a89082d249"

RPROVIDES:${PN} += "libcivetweb-cpp.so.1.15.0 \
libcivetweb-cpp1-15-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcivetweb.so.1.15.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
