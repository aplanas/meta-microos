SUMMARY = "Library for handling xkb descriptions"
DESCRIPTION = "libxkbregistry is a C library that lists available XKB models, \
layouts and variants for a given ruleset."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbregistry0-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "dddf98940c4423f792a593995cf94f424091050c4d4f8593d2dc9d80646193f8f6f6f52d3405456e8ce9d2645338e39485b8ee1b6898d8b6c90d4743948c09e2"

RPROVIDES:${PN} += "libxkbregistry.so.0 \
libxkbregistry0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2"

inherit rpm
