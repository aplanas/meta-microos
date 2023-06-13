SUMMARY = "Library for handling xkb descriptions"
DESCRIPTION = "libxkbregistry is a C library that lists available XKB models, \
layouts and variants for a given ruleset."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbregistry0-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "0d1dbac29c5d97c2fc8b9ac87f8ba45c7324906f3e5a2015e842b8b0949493bd7cc183975a16f37bdb28215bc3b1bfb192abc0ed529a1d04e2d2abf1f5bcfd34"

RPROVIDES:${PN} += "libxkbregistry.so.0()(64bit) \
libxkbregistry0 \
libxkbregistry0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
