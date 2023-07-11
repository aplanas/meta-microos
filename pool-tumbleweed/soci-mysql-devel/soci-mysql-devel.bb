SUMMARY = "Development files for the soci MariaDB back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with MariaDB."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-mysql-devel-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "de296bfd874cad1e488cc5a73434235a174e847764040f05eda38c67a199db50d7b2cebfe2227240140a151037c79ad60f77a801f6b3af2cbcea6861ca2c9768"

RPROVIDES:${PN} += "soci-mysql-devel"

RDEPENDS:${PN} += "libsoci-mysql4-0 \
pkgconfig-libmariadb \
soci-devel"

inherit rpm
