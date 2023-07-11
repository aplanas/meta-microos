SUMMARY = "Header files for libmypaint, a brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes \
which is used by MyPaint and other projects. \
This package provides the header needed for developing \
applications using libmypaint."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint-devel-1.6.1-2.4.aarch64.rpm"
RPM_HASH = "86bf6162510ad6fdd502bdaae74d3ca30356c75308b826e7b85c813308df1598abea4be5926e2113a23cfd0f6d6444fcc102c565aa582ccc490ddb66cd5e0c80"

RPROVIDES:${PN} += "libmypaint-devel \
mypaint-devel \
pkgconfig-libmypaint"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmypaint0 \
pkgconfig-json-c"

inherit rpm
