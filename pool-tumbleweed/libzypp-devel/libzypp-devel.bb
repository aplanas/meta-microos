SUMMARY = "Header files for libzypp, a library for package management"
DESCRIPTION = "Development files for libzypp, a library for package, patch, pattern \
and product management."
LICENSE = "GPL-2.0-or-later"

PV = "17.31.19"

RPM_NAME = "libzypp-devel-17.31.19-1.2.aarch64.rpm"
RPM_HASH = "5dca553089c3e1b2b6e5b041ed85830d6703ccacc5bd1622c919786701c953e8f8feaf1ed2e0bd3344da2c5e1beedc500f82288f579d4124ee4a8d16f3b9fed6"

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
