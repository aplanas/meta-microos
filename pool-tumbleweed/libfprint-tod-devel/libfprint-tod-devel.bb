SUMMARY = "Headers for the fingerprint reader library"
DESCRIPTION = "This package contains the header files and development documentation \
for libfprint. If you like to develop programs using libfprint, you \
will need to install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "libfprint-tod-devel-1.94.5+tod1-1.3.aarch64.rpm"
RPM_HASH = "72481c418f7d1fb1c9040a6338c0d8987af108b9ff09badf9e4ed8832c7b025864534ca819ca881765689a38be65fcc6e7ff4c4735aa62d5197f08ded609d230"

RPROVIDES:${PN} += "libfprint-tod-devel \
libfprint-tod-devel(aarch-64) \
pkgconfig(libfprint-2-tod-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfprint \
libfprint-2-tod1 \
libfprint-devel \
libfprint-tod \
pkgconfig(glib-2.0) \
pkgconfig(gudev-1.0) \
pkgconfig(gusb) \
pkgconfig(libfprint-2) \
pkgconfig(nss) \
pkgconfig(pixman-1)"

inherit rpm
