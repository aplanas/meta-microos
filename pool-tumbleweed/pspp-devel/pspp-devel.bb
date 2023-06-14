SUMMARY = "Development files for pspp, a statistical analysis program"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains libraries and header files for developing \
applications that want to build pspp plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "pspp-devel-1.4.1-3.12.aarch64.rpm"
RPM_HASH = "e5411fb7c58a5583ac5eb7a716bd8f7a852e0d216c13cc3384662ab16e35d0ab5466279405682f212084bf239f3c77477b5e5893c933ffb970693184f3ee1e18"

RPROVIDES:${PN} += "pspp-devel"

RDEPENDS:${PN} += "glibc-devel \
gsl-devel \
libxml2-devel \
postgresql-devel \
xz-devel \
zlib-devel"

inherit rpm
