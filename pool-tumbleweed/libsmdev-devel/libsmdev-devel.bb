SUMMARY = "Development files for libsmdev, a storage media access library"
DESCRIPTION = "libsmdev is a library to access and read storage media devices. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmdev."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev-devel-20221028-2.8.aarch64.rpm"
RPM_HASH = "e41c3abd1203eff41e8d77e1c043772cf005d2a3a43ae39ff0a3992ea60750e084729c6812b4ad3d17d1e49c45da61a8447fdd44e12b43f6f9a73e629bbf5375"

RPROVIDES:${PN} += "libsmdev-devel \
pkgconfig-libsmdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmdev1"

inherit rpm
