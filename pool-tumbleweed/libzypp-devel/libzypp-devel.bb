SUMMARY = "Header files for libzypp, a library for package management"
DESCRIPTION = "Development files for libzypp, a library for package, patch, pattern \
and product management."
LICENSE = "GPL-2.0+"

PV = "17.31.11"

RPM_NAME = "libzypp-devel-17.31.11-1.1.aarch64.rpm"
RPM_HASH = "66b42c88e8676bde6e0ae6bc4fc728706eb8b824222e29f434ecbf8e2a39cef1a39403a7f26fb4df5226a8ab5f8ca8e4df205801044782815d812da6f0e18980"

RPROVIDES:${PN} += "libzypp-devel \
libzypp-devel(aarch-64) \
pkgconfig(libzypp) \
yast2-packagemanager-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
bzip2 \
glibc-devel \
libboost_headers-devel \
libboost_program_options-devel \
libboost_test-devel \
libboost_thread-devel \
libcurl-devel \
libsolv-devel \
libstdc++-devel \
libudev-devel \
libxml2-devel \
libzypp \
pkgconfig(openssl) \
popt-devel \
rpm-devel \
zlib-devel"

inherit rpm
