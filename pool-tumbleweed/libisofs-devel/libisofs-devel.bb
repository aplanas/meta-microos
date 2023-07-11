SUMMARY = "Development Files for libisofs"
DESCRIPTION = "Development files for developing applications using libisofs."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "libisofs-devel-1.5.6-1.1.aarch64.rpm"
RPM_HASH = "aa887990959659913ee4743c8d658f727fd1e6434bdb818a631bd7167a8bad87e846196add34707727e54addcf26a0382a427c44baf02977e5fc8cda4294d09b"

RPROVIDES:${PN} += "libisofs-devel \
pkgconfig-libisofs-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libisofs6"

inherit rpm
