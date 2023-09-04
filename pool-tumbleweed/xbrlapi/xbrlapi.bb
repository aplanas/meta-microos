SUMMARY = "X BrlAPI helper"
DESCRIPTION = "The xbrlapi utility is a helper to have BrlAPI work on a X system."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "xbrlapi-6.6-1.1.aarch64.rpm"
RPM_HASH = "e3813dc4d0a002a42adfd39639250a2072edec052cfef86c4a9a1fb6ab25480207c8c6ae2913b670c607ca6d5a49f124638d57349f086e04214da0c16714c8eb"

RPROVIDES:${PN} += "xbrlapi"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXtst.so.6 \
libbrlapi.so.0.8 \
libc.so.6 \
libicuuc.so.73"

inherit rpm
