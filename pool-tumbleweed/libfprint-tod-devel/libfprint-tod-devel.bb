SUMMARY = "Headers for the fingerprint reader library"
DESCRIPTION = "This package contains the header files and development documentation \
for libfprint. If you like to develop programs using libfprint, you \
will need to install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "libfprint-tod-devel-1.94.5+tod1-1.4.aarch64.rpm"
RPM_HASH = "692d91d2c0f66e99e7ce7a7110031873d488760cba2761cb8737b37340cb1f442303399b4b3772307ea8eaedc2263a06a968dea11990889595ced97a052d27ef"

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
