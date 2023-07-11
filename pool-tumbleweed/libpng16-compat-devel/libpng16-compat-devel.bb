SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng16-compat-devel package contains unversioned symlinks \
to the header files, libraries, configuration files and development \
tools necessary for compiling and linking programs that don't care \
about libpng version."
LICENSE = "libpng-2.0"

PV = "1.6.40"

RPM_NAME = "libpng16-compat-devel-1.6.40-1.1.aarch64.rpm"
RPM_HASH = "32b37ee9a308ce7c79f4c3249b6e4196118d6c6b403bf855d2c64a86321178a57ce7e5c6a5f40a864d2b70324d0493519a2ab230f4f2d7cb8c7930b0368c4c07"

RPROVIDES:${PN} += "libpng-devel \
libpng16-compat-devel \
pkgconfig-libpng"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpng16-devel \
pkgconfig-zlib"

inherit rpm
