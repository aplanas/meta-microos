SUMMARY = "Development files for libwpe"
DESCRIPTION = "The libwpe-devel package contains libraries, build data, and \
header files for developing applications that use libwpe."
LICENSE = "BSD-2-Clause"

PV = "1.14.1"

RPM_NAME = "libwpe-devel-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "c71c1d82d9f26f8714d2a9ef7818def01b19fad2b22919b924864800cecdc9d3ccb3db95cc4b7dfb2c579ce2a9787e5f7858190651cc48f98bedb211dcdd744a"

RPROVIDES:${PN} += "libwpe-devel \
pkgconfig-wpe-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwpe-1-0-1 \
pkgconfig-egl \
pkgconfig-xkbcommon"

inherit rpm
