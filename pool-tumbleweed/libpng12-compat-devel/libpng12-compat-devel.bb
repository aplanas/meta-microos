SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng12-compat-devel package contains unversioned symlinks \
to the header files, libraries, configuration files and development \
tools necessary for compiling and linking programs that don't care \
about libpng version."
LICENSE = "Zlib"

PV = "1.2.59"

RPM_NAME = "libpng12-compat-devel-1.2.59-2.7.aarch64.rpm"
RPM_HASH = "251f82c70122e4b5af8a8e01a6ac34ca7d5bacd8ee8ef7205c91e0252647b2a9f544fc4ce79f8a24f844cadd66e52a008f47168c0643e82c57c1702965b68ea4"

RPROVIDES:${PN} += "libpng-devel \
libpng12-compat-devel \
pkgconfig-libpng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpng12-devel"

inherit rpm
