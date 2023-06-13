SUMMARY = "Headers for the fingerprint reader library"
DESCRIPTION = "This package contains the header files and development documentation \
for libfprint. If you like to develop programs using libfprint, you \
will need to install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "libfprint-devel-1.94.5+tod1-1.3.aarch64.rpm"
RPM_HASH = "5a770ff851812bc0ff1218e5a43d8a0a0b46fac70979dcd8ce59a27bd7fd53b54fa8031afdfd03c30ed39bc6e3a76e4fac7814770f944baa385c6f9cc6e4da3f"

RPROVIDES:${PN} += "libfprint-devel \
libfprint-devel(aarch-64) \
pkgconfig(libfprint-2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfprint \
libfprint-2-2 \
pkgconfig(gio-unix-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm
