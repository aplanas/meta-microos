SUMMARY = "Library for the Portable Network Graphics Format (PNG)"
DESCRIPTION = "libpng is the official reference library for the Portable Network \
Graphics format (PNG)."
LICENSE = "Zlib"

PV = "1.2.59"

RPM_NAME = "libpng12-0-1.2.59-2.7.aarch64.rpm"
RPM_HASH = "19ef37930d4877b7aec4a48c7edce88ea2981a16fb566cc6836d51e358e77733f4e1e261cd02b245d0b55fad3ea27f14a59e57ac5187e07fa2baac5fb6baa30f"

RPROVIDES:${PN} += "libpng \
libpng12-0 \
libpng12.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
