SUMMARY = "Library for parsing, formatting, and validating international phone numbers"
DESCRIPTION = "Google's common Java, C++ and JavaScript library for parsing, formatting, \
and validating international phone numbers. The Java version is optimized \
for running on smartphones, and is used by the Android framework since 4.0 \
(Ice Cream Sandwich). \
 \
 \
This package provides libraries and header files for developing applications \
that use libphonenumber."
LICENSE = "Apache-2.0"

PV = "8.13.15"

RPM_NAME = "libphonenumber-devel-8.13.15-1.4.aarch64.rpm"
RPM_HASH = "111bb628ba0351aa55be43580f3c85ad92e257940359500a48104bb2c6fe282e5d5b4676c0b3f622fd49834094ca55e96140b07776f39bd12548932ba45c2467"

RPROVIDES:${PN} += "cmake-libphonenumber \
libphonenumber-devel"

RDEPENDS:${PN} += "cmake-absl \
libphonenumber8 \
pkgconfig-protobuf"

inherit rpm
