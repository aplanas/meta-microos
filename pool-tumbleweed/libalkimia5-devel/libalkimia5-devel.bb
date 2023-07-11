SUMMARY = "Development Files for libalkimia"
DESCRIPTION = "The development files for libalkimia."
LICENSE = "LGPL-2.1-or-later"

PV = "8.1.1"

RPM_NAME = "libalkimia5-devel-8.1.1-1.5.aarch64.rpm"
RPM_HASH = "dd0634b5d4a7c601809bdd3df1fcf244f5adbc4df7ae1fe121317e5e7309e150d69518fb4ad27331b0a353e508fee837a0de565da586d4ecb477d0c15bbeeaa2"

RPROVIDES:${PN} += "cmake-LibAlkimia5 \
libalkimia5-devel \
pkgconfig-libalkimia5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libalkimia5-8"

inherit rpm
