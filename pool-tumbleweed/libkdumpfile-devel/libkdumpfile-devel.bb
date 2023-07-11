SUMMARY = "Include files and libraries for libkdumpfile development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libkdumpfile."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.1+git3.g97c716a"

RPM_NAME = "libkdumpfile-devel-0.5.1+git3.g97c716a-3.2.aarch64.rpm"
RPM_HASH = "678776031d12440e3c981b6d96aac23e03f666e81187e767dbcb6b6a5842aa6ed2252a2d8015c33741ead85829e9809675f364c3a6484f6f71587244ddd6330a"

RPROVIDES:${PN} += "libkdumpfile-devel \
pkgconfig-libkdumpfile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libkdumpfile10 \
pkgconfig-libaddrxlat \
pkgconfig-libzstd \
pkgconfig-lzo2 \
pkgconfig-snappy \
pkgconfig-zlib"

inherit rpm
