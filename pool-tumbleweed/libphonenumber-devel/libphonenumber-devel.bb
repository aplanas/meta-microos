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

RPM_NAME = "libphonenumber-devel-8.13.15-1.2.aarch64.rpm"
RPM_HASH = "2f1787d96f72fa9510e391a828996d1b6804abd17847e36ea6884e416503a470567e7da4c771f3c42a2f8324e01ef7b4025a23862cbcc18032028cc87f72ff2a"

RPROVIDES:${PN} += "cmake-libphonenumber \
libphonenumber-devel"

RDEPENDS:${PN} += "cmake-absl \
libphonenumber8 \
pkgconfig-protobuf"

inherit rpm
