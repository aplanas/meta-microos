SUMMARY = "Development files for libsmdev, a storage media access library"
DESCRIPTION = "libsmdev is a library to access and read storage media devices. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmdev."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev-devel-20221028-3.1.aarch64.rpm"
RPM_HASH = "355704396819c880d8fa7a788fc5ab8318ee9e0ff37cf9595a3056b1135aa844964e03b02331171b1777f488aec4336aed0335252f8e63037fec35f3b2ed9fa7"

RPROVIDES:${PN} += "libsmdev-devel \
pkgconfig-libsmdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmdev1"

inherit rpm
