SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng12-compat-devel package contains unversioned symlinks \
to the header files, libraries, configuration files and development \
tools necessary for compiling and linking programs that don't care \
about libpng version."
LICENSE = "Zlib"

PV = "1.2.59"

RPM_NAME = "libpng12-compat-devel-1.2.59-2.6.aarch64.rpm"
RPM_HASH = "040dcb68fcca6bb0482e870f845d1518b7ac9f1d05b83ec5a0ab282c9aafb044eba1c673f43260ea3b61b93c01d770e7fe00e2c1d4d9241cc995fc9851b222fa"

RPROVIDES:${PN} += "libpng-devel \
libpng12-compat-devel \
libpng12-compat-devel(aarch-64) \
pkgconfig(libpng)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpng12-devel"

inherit rpm
