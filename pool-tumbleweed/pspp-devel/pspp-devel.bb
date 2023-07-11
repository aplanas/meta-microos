SUMMARY = "Development files for pspp, a statistical analysis program"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains libraries and header files for developing \
applications that want to build pspp plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "pspp-devel-1.4.1-3.14.aarch64.rpm"
RPM_HASH = "b307f05e3f7ce781683016bca245f78b3309187bedf5f16d3f3b3e706e6fc6f97de6fe2aa7ae3fc6bd68a9f5fa58c30ed46407b2bd8c7e90395ecd891be75f23"

RPROVIDES:${PN} += "pspp-devel"

RDEPENDS:${PN} += "glibc-devel \
gsl-devel \
libxml2-devel \
postgresql-devel \
xz-devel \
zlib-devel"

inherit rpm
