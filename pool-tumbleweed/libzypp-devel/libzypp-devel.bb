SUMMARY = "Header files for libzypp, a library for package management"
DESCRIPTION = "Development files for libzypp, a library for package, patch, pattern \
and product management."
LICENSE = "GPL-2.0-or-later"

PV = "17.31.17"

RPM_NAME = "libzypp-devel-17.31.17-1.1.aarch64.rpm"
RPM_HASH = "823e41baf26dd7d0496234f079e29f21e07cd8c10b8a54b0a9134a67bc54494201f4128871cc0bad831bd4c4f2b59ceba77d4080d7f932ddc230bcac3784e35d"

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
