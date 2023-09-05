SUMMARY = "Header files for libzypp, a library for package management"
DESCRIPTION = "Development files for libzypp, a library for package, patch, pattern \
and product management."
LICENSE = "GPL-2.0-or-later"

PV = "17.31.20"

RPM_NAME = "libzypp-devel-17.31.20-1.1.aarch64.rpm"
RPM_HASH = "f5f1b6362c78e16436c63771a814e78bef5f99d3bfca13ffbf710bcce56425060a7d8455aca8316c999ad8c5a075c8ad969e0a1e8b8590eee7f39aa07410024a"

RPROVIDES:${PN} += "libzypp-devel \
libzypp-tui-devel \
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
