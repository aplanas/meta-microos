SUMMARY = "Headers for the fingerprint reader library"
DESCRIPTION = "This package contains the header files and development documentation \
for libfprint. If you like to develop programs using libfprint, you \
will need to install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.6+tod1"

RPM_NAME = "libfprint-tod-devel-1.94.6+tod1-1.1.aarch64.rpm"
RPM_HASH = "adfbc6f82210e847516b6cb46846ea149c2c2ada49b510081ff3c738d1c163c00eb6d574363d87426254e42e642edb64081c6997826d69064d3377f53f63898e"

RPROVIDES:${PN} += "libfprint-tod-devel \
pkgconfig-libfprint-2-tod-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfprint \
libfprint-2-tod1 \
libfprint-devel \
libfprint-tod \
pkgconfig-glib-2.0 \
pkgconfig-gudev-1.0 \
pkgconfig-gusb \
pkgconfig-libfprint-2 \
pkgconfig-nss \
pkgconfig-pixman-1"

inherit rpm
