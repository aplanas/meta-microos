SUMMARY = "Development files for PAPPL"
DESCRIPTION = "PAPPL is a C-based framework/library for developing CUPS Printer \
Applications, which are the recommended replacement for printer \
drivers. \
 \
This subpackage contains the headers for the library."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "pappl-devel-1.3.4-1.1.aarch64.rpm"
RPM_HASH = "d49a9fc94537aacf107b8187a0745cdd39f8bff333adb7de3da15194ef556708071765560e80e0c6751c7a7fd36f3410980f5a844ce7e28e9e67b9624a03d687"

RPROVIDES:${PN} += "pappl-devel \
pkgconfig-pappl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpappl1 \
pkgconfig-avahi-client \
pkgconfig-libjpeg \
pkgconfig-libpng \
pkgconfig-libusb-1.0 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
