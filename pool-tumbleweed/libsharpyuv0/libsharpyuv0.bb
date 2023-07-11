SUMMARY = "Library for sharpening YUV option in WebP"
DESCRIPTION = "Library that provides the sharpening YUV option for better WebP images."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libsharpyuv0-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "938c9498c4c48c05f11b5c62413c9ec5b0a9ed786160a76c57da92c64536698cfbddec5f396df2c238478f4de088f80bba607ddc47f5041f63658ee4c953ce34"

RPROVIDES:${PN} += "libsharpyuv.so.0 \
libsharpyuv0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
