SUMMARY = "Development files for libcmis-c"
DESCRIPTION = "Development files for libcmis-c. libcmis-c is a C client library for \
the CMIS interface."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libcmis-c-devel-0.5.2-1.24.aarch64.rpm"
RPM_HASH = "d91e871eb2cb4fe5bd48c29a82fdff4ad9f8f6fd2e4ff6c3133eb6cacdae45aca5a0db0e567779f13526ae33dc9a490ffe6e8b6988fcb97013759bb0b9053726"

RPROVIDES:${PN} += "libcmis-c-devel \
pkgconfig-libcmis-c-0.5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcmis-c-0-5-5 \
pkgconfig-libcmis-0.5 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0"

inherit rpm
