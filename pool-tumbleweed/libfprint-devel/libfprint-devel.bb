SUMMARY = "Headers for the fingerprint reader library"
DESCRIPTION = "This package contains the header files and development documentation \
for libfprint. If you like to develop programs using libfprint, you \
will need to install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "libfprint-devel-1.94.5+tod1-1.4.aarch64.rpm"
RPM_HASH = "80bee9d9fb37b32dd83e79af7b5a4bfa91093017d8693b0f469854260501da7584c6ebba8ba29b29912048fee31487d4dd5fee621a5ccaa0e9a3be4acc66e403"

RPROVIDES:${PN} += "libfprint-devel \
pkgconfig-libfprint-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfprint \
libfprint-2-2 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
