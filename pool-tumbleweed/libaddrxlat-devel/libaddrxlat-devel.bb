SUMMARY = "Include files and libraries for libaddrxlat development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libaddrxlat."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libaddrxlat-devel-0.5.2-1.1.aarch64.rpm"
RPM_HASH = "82b09f0c23111743e0fb56439c4f6e4bcfbc983824b459025dbcf01b20d3b177854be812332e4e64274966bf97cc5555a2fbe93b88b3a4d32e8bd3501141adfc"

RPROVIDES:${PN} += "libaddrxlat-devel \
pkgconfig-libaddrxlat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libaddrxlat3"

inherit rpm
