SUMMARY = "Library to access image metadata"
DESCRIPTION = "libexiv2 is a C++ library with a C compatibility interface to access \
image metadata, esp from Exif tags."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.27.6"

RPM_NAME = "libexiv2-27-0.27.6-3.3.aarch64.rpm"
RPM_HASH = "470601acb7d92fadabecf64be56b0966c8dde45fcb8ad24e6dbaa92dd928549bf9663afe87385457c8514a978af0b7de9bcb85e18fffbf4197976380b41d7d0e"

RPROVIDES:${PN} += "libexiv2-27 \
libexiv2.so.27"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
