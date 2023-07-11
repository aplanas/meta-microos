SUMMARY = "Header files for libzypp, a library for package management"
DESCRIPTION = "Development files for libzypp, a library for package, patch, pattern \
and product management."
LICENSE = "GPL-2.0-or-later"

PV = "17.31.15"

RPM_NAME = "libzypp-devel-17.31.15-1.2.aarch64.rpm"
RPM_HASH = "df49c1bfdccc478b71e8baf58da3ccd8778e3c545f21bd61adf89ebd0faacd960018d39a192eb045595804152a01f4124d7c22d9b30c3926ff980103cbd3a051"

RPROVIDES:${PN} += "libzypp-devel \
pkgconfig-libzypp \
yast2-packagemanager-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
bzip2 \
glibc-devel \
libboost-headers-devel \
libboost-program-options-devel \
libboost-test-devel \
libboost-thread-devel \
libcurl-devel \
libsolv-devel \
libstdc++-devel \
libudev-devel \
libxml2-devel \
libzypp \
pkgconfig-openssl \
popt-devel \
rpm-devel \
zlib-devel"

inherit rpm
