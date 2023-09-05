SUMMARY = "Development Files for libburn"
DESCRIPTION = "Development files for developing applications using libburn."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "libburn-devel-1.5.6-2.1.aarch64.rpm"
RPM_HASH = "cafbe525201bd7bed83423c33af3ce044fbb241b02002a5b92d542e79d4cb4d3f334b7fdb9b77b3de5dffc2999c75ef002f3dacdf44a73261c3bf82c5afc295e"

RPROVIDES:${PN} += "libburn-devel \
pkgconfig-libburn-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libburn4"

inherit rpm
