SUMMARY = "Development files for taglib"
DESCRIPTION = "This package contains development files for taglib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13"

RPM_NAME = "libtag-devel-1.13-1.3.aarch64.rpm"
RPM_HASH = "79a045670e5f05b828e802e488933b2c6e53b6dc255318aaf7fff7eeed6ba840169bac3f2cedaa04b9f3c11eff0acd67cace71b0f9d98bff23ce8af9a20075d7"

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
