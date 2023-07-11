SUMMARY = "Development files for the GObject Data Mapper"
DESCRIPTION = "This is a DataMapper for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4"

RPM_NAME = "gom-devel-0.4-1.16.aarch64.rpm"
RPM_HASH = "7d8b5d336ecd0dc1a3f8c834226aad053b8bce5045dc305c40e446884e7ee5614d4ca15510ce3432980a6bad92ce81b018f174c00a809feb83083e752cb5d2c9"

RPROVIDES:${PN} += "gom-devel \
pkgconfig-gom-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgom-1-0-0 \
pkgconfig-gobject-2.0 \
python3-gom \
typelib-1-0-Gom-1-0"

inherit rpm
