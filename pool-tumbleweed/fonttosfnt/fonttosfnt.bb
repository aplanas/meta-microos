SUMMARY = "Utility to wrap a bitmap font in a sfnt (TrueType) wrapper"
DESCRIPTION = "Wrap a bitmap font or a set of bitmap fonts in a sfnt (TrueType or \
OpenType) wrapper."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "fonttosfnt-1.2.2-1.7.aarch64.rpm"
RPM_HASH = "811e16387cdfcfb581e0c5ca35a5f3c0c17bca5e48235d23309afe859598ea925582f58df4d079a80d244b65a5d85ab80ad6d0a4bef6b00970a31392d7b3f275"

RPROVIDES:${PN} += "fonttosfnt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontenc.so.1 \
libfreetype.so.6 \
libm.so.6"

inherit rpm
