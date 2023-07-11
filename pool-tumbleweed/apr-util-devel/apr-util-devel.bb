SUMMARY = "Development files for the Apache Portable Runtime (APR) Utility Library"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the APR Utility library."
LICENSE = "Apache-2.0"

PV = "1.6.3"

RPM_NAME = "apr-util-devel-1.6.3-1.3.aarch64.rpm"
RPM_HASH = "896f24c7146a52d09d53a6ff7ee0174f8075002d62d1cf6195615286eb26d6cb35aa3f34dd3cf2a0e4b7c50b45187d25edb25e12dbdc4d5a5729ccbb3d4e118f"

RPROVIDES:${PN} += "apr-util-devel \
libapr-util1-devel \
pkgconfig-apr-util-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
apr-devel \
gdbm-devel \
libapr-util1-0 \
libexpat-devel \
openldap2-devel \
pkgconfig-apr-1"

inherit rpm
