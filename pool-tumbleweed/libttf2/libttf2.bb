SUMMARY = "TrueType Font Engine"
DESCRIPTION = "A library for working with TrueType Fonts. Documentation is in the \
/usr/share/doc/packages/freetype directory."
LICENSE = "SUSE-Freetype | GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "libttf2-1.3.1-1419.13.aarch64.rpm"
RPM_HASH = "4cb7d57370206ceb7527aedcb79d87b47d5c4cf57c86cb055f7bc1f1a8e171c4f8639a17db3b238b8e6cf2264e3eba343052cd7f89a15ee4f616a3d80867554b"

RPROVIDES:${PN} += "libttf.so.2 \
libttf2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
