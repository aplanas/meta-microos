SUMMARY = "Library to access image metadata"
DESCRIPTION = "libexiv2 is a C++ library with a C compatibility interface to access \
image metadata, esp from Exif tags."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "libexiv2-28-0.28.0-2.1.aarch64.rpm"
RPM_HASH = "6aa2187c8671f170b3171e144592f07c4e9eb622cb3dd527061cd84ca072fc850208af1f3a3bf1ff89bb98f2f9a5fce2bed1e4429addacbaaf62647a44e79870"

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
