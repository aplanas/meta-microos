SUMMARY = "Header files for libzypp, a library for package management"
DESCRIPTION = "Development files for libzypp, a library for package, patch, pattern \
and product management."
LICENSE = "GPL-2.0-or-later"

PV = "17.31.15"

RPM_NAME = "libzypp-devel-17.31.15-1.3.aarch64.rpm"
RPM_HASH = "3d62fa0f779739357540146eb2254fac459561cae78b0827c51f8496a185c2727badea936e4403939ed5d4dfb48392595d4f570a22295496a220be66f3018b0b"

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
