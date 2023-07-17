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

RPM_NAME = "libphonenumber-devel-8.13.15-1.3.aarch64.rpm"
RPM_HASH = "6e468c538c486d0bf89d73d3e428af5751a69e3cee59194d3ac5bd2229d86a99324bd9aceb174dcce390820bcd6548cc762fddc1ea25c87568ebb7844e0b2ce8"

RPROVIDES:${PN} += "cmake-libphonenumber \
libphonenumber-devel"

RDEPENDS:${PN} += "cmake-absl \
libphonenumber8 \
pkgconfig-protobuf"

inherit rpm
