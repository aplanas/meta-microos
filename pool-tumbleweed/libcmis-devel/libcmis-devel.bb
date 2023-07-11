SUMMARY = "Development files for libcmis"
DESCRIPTION = "Development files for libcmis. libcmis is a C++ client library for \
the CMIS interface."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libcmis-devel-0.5.2-1.25.aarch64.rpm"
RPM_HASH = "3613f28de97eae1e65ef2b567abfc891748d0e07e1c32c91dcffeaa1dade73fb4c0a351861a2e4aaabf64e70126e31eae07388bab376efa18014540f6f10b23c"

RPROVIDES:${PN} += "libcmis-devel \
pkgconfig-libcmis-0.5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcmis-0-5-5 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0"

inherit rpm
