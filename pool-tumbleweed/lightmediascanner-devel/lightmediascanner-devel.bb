SUMMARY = "Development files of lightmediascanner"
DESCRIPTION = "Lightweight media scanner. \
 \
This package contains header files and libraries needed to develop \
application that use lightmediascanner."
LICENSE = "LGPL-2.1"

PV = "0.5.2"

RPM_NAME = "lightmediascanner-devel-0.5.2-2.5.aarch64.rpm"
RPM_HASH = "59411f5a14b3da9f705c64a9f55aad32c471583390958fa5ee2dfc826aa338e7bff0d597e01cf4b03d27f7f144617521251a1ac1f3af1fedf4798c0113d492b8"

RPROVIDES:${PN} += "lightmediascanner-devel \
pkgconfig-lightmediascanner"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblightmediascanner0 \
pkgconfig-sqlite3"

inherit rpm
