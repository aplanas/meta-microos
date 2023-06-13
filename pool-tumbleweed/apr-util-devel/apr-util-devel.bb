SUMMARY = "Development files for the Apache Portable Runtime (APR) Utility Library"
DESCRIPTION = "This subpackage contains header files for developing applications \
that want to make use of the APR Utility library."
LICENSE = "Apache-2.0"

PV = "1.6.3"

RPM_NAME = "apr-util-devel-1.6.3-1.2.aarch64.rpm"
RPM_HASH = "921a06a4ee4e8b9a34095d7a3cfd8e5b613abe9ade6b5ddab56ee5c9856b30b00909e6399f8558d5d64f0079e2c4687c5d98fe3b9b841772813d48147bc5b7f1"

RPROVIDES:${PN} += "apr-util-devel \
apr-util-devel(aarch-64) \
libapr-util1-devel \
pkgconfig(apr-util-1)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
apr-devel \
gdbm-devel \
libapr-util1-0 \
libexpat-devel \
openldap2-devel \
pkgconfig(apr-1)"

inherit rpm
