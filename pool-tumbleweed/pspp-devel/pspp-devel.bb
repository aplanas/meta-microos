SUMMARY = "Development files for pspp, a statistical analysis program"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains libraries and header files for developing \
applications that want to build pspp plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.2"

RPM_NAME = "pspp-devel-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "f6130e7bdb84014a62b910d7978fa47e90fb3caeb394deb6cc22b101b9d8c92408b6eb5dc0cda72ad6775021e58a85b21ed28560bec06eb755ac2b12ad4e40b2"

RPROVIDES:${PN} += "pspp-devel"

RDEPENDS:${PN} += "glibc-devel \
gsl-devel \
libxml2-devel \
postgresql-devel \
xz-devel \
zlib-devel"

inherit rpm
