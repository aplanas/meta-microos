SUMMARY = "The shared library of Matsui's C Preprocessor"
DESCRIPTION = "mcpp is a small and portable C/C++ preprocessor implementing all of \
C90, C99 and C++98. \
 \
This package holds the shared libraries of libev."
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "libmcpp0-2.7.2-24.15.aarch64.rpm"
RPM_HASH = "66511af2cc0e06cf9b523c4fa229250d4e81b8c0be6a58cf9a49ae4dc2f4e797975b666c1ceb192f3bd737ec902746555e7d67233b59055b968dfd11006e5703"

RPROVIDES:${PN} += "libmcpp.so.0 \
libmcpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
