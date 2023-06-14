SUMMARY = "Library to parse flash media stream URLs -- Development Files"
DESCRIPTION = "libquvi is a cross-platform library for parsing flash media stream \
URLs with C API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "libquvi-devel-0.9.4-7.6.aarch64.rpm"
RPM_HASH = "0b6489584f8f7ef829a90a91a4139ab775d06b9706ab218173f5dd568c733c9c1cc32f1dee692ab30688dfdafb90e8b7a0716bfa847427cc5b7fe04797b45ca2"

RPROVIDES:${PN} += "libquvi-devel \
pkgconfig-libquvi-0.9"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libquvi-0-9-0-9-4"

inherit rpm
