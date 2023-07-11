SUMMARY = "Library to access image metadata"
DESCRIPTION = "libexiv2 is a C++ library with a C compatibility interface to access \
image metadata, esp from Exif tags."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "libexiv2-28-0.28.0-1.1.aarch64.rpm"
RPM_HASH = "de63efb3986844b1d840a0d6bc0d99db60ec3e6a1e9b8d15cec635ade846de67fa830f66b7d45cb9e58181f20a4fc81a9bd665c60d039239cfa8dc00b7893cb0"

RPROVIDES:${PN} += "libexiv2-28 \
libexiv2.so.28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libINIReader.so.0 \
libbrotlidec.so.1 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
