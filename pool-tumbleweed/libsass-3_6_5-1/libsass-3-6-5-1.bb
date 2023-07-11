SUMMARY = "Compiler library for A CSS preprocessor language"
DESCRIPTION = "This package provides the shared library object for libsass."
LICENSE = "MIT"

PV = "3.6.5"

RPM_NAME = "libsass-3_6_5-1-3.6.5-1.9.aarch64.rpm"
RPM_HASH = "aea28e7a1b36cb8aa5717291ca5af75d8e8982d48bd82214eddce01ca3b496991cb741f8ddb66c525c16a004072a9fa3ffcd43f69aa7c122aee00c169860ad96"

RPROVIDES:${PN} += "libsass-3-6-5-1 \
libsass-3.6.5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
