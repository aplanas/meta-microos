SUMMARY = "Compiler library for A CSS preprocessor language"
DESCRIPTION = "This package provides the shared library object for libsass."
LICENSE = "MIT"

PV = "3.6.5"

RPM_NAME = "libsass-3_6_5-1-3.6.5-1.8.aarch64.rpm"
RPM_HASH = "bd97dda04941f86394deaec858477bf9b94a74e542700d9b866405f98705f6bec46458fa173210da98f3f584866ac040c1075c571070d19b0da117ff241d6b89"

RPROVIDES:${PN} += "libsass-3.6.5.so.1()(64bit) \
libsass-3_6_5-1 \
libsass-3_6_5-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
