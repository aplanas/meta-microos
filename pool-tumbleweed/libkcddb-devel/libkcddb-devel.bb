SUMMARY = "Development files for KDE CDDB library"
DESCRIPTION = "This package includes the development headers for libkcddb."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkcddb-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e9e24b6fb8d1623ac473ee9972a7b533ea890de29700a9dc0d815b43f25590e72ec3fb5e6b34d97938f739d9a6d38c807900efdc044caba8a14dabe9df0796f2"

RPROVIDES:${PN} += "cmake-KF5Cddb \
libkcddb-devel \
libkcddb5-devel"

RDEPENDS:${PN} += "libKF5Cddb5 \
libkcddb"

inherit rpm
