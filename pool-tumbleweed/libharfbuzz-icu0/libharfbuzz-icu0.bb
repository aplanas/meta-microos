SUMMARY = "ICU integration into the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the ICU library."
LICENSE = "MIT"

PV = "8.1.1"

RPM_NAME = "libharfbuzz-icu0-8.1.1-1.1.aarch64.rpm"
RPM_HASH = "fca3b3b1478c8a0eaa3c42085cca828c754169b2f3ea59a157c3b95a21fd5bba25addbae2d9b72fe0a72923aa90c236d6ed3022dbe9aa0d0e28b09ede01b97c6"

RPROVIDES:${PN} += "libharfbuzz-icu.so.0 \
libharfbuzz-icu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libicuuc.so.73"

inherit rpm
