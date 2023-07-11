SUMMARY = "Development files for libsmdev, a storage media access library"
DESCRIPTION = "libsmdev is a library to access and read storage media devices. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmdev."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev-devel-20221028-2.11.aarch64.rpm"
RPM_HASH = "d54b159e2c4d848908c1aad66ae7509c29df58bac353ebf10322952bceff53d372c1598381613a92b92b397e44ae57dfe391d0f6a4f79e1a103bc9a43594c9fb"

RPROVIDES:${PN} += "libsmdev-devel \
pkgconfig-libsmdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmdev1"

inherit rpm
