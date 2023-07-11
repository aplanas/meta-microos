SUMMARY = "Development files for taglib"
DESCRIPTION = "This package contains development files for taglib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13"

RPM_NAME = "libtag-devel-1.13-1.4.aarch64.rpm"
RPM_HASH = "c3fd09895b37387c0499200b85085f3dc277705571492ad3e0af441406c903f42aef120987ea66e9b634c5a855cc4324dde3d1862d959f2fd317e926e5efcabc"

RPROVIDES:${PN} += "libtag-devel \
pkgconfig-taglib \
pkgconfig-taglib-c \
taglib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libstdc++-devel \
libtag-c0 \
libtag1 \
pkgconfig-taglib \
zlib-devel"

inherit rpm
