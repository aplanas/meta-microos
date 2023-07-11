SUMMARY = "Dependency injection framework for Qt"
DESCRIPTION = "injeqt is an attempt to build a powerful and reliable dependency injection \
framework on Qt's reflection based on MOC (meta-object compiler). \
 \
Files mandatory for development."
LICENSE = "LGPL-2.1+"

PV = "1.2.0"

RPM_NAME = "injeqt-devel-1.2.0-1.29.aarch64.rpm"
RPM_HASH = "2838ff76cf086996719710de7ca7d1d1f533a7c88bcc7251fd0314606a8dbd6cdd511b6efe6e6fad61135abe15176f83518f6b09e0e558328913e9063fdd1e17"

RPROVIDES:${PN} += "injeqt-devel \
pkgconfig-injeqt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinjeqt1"

inherit rpm
