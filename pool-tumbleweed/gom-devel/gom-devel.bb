SUMMARY = "Development files for the GObject Data Mapper"
DESCRIPTION = "This is a DataMapper for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4"

RPM_NAME = "gom-devel-0.4-1.15.aarch64.rpm"
RPM_HASH = "1dd16301aedbad33c549daab6515a9840869724b072da22cc548df3df435484eea90335b93b80ecf921e5235b81aa713783b42d78fda29d5dacd6218d4f22c11"

RPROVIDES:${PN} += "gom-devel \
gom-devel(aarch-64) \
pkgconfig(gom-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgom-1_0-0 \
pkgconfig(gobject-2.0) \
python3-gom \
typelib-1_0-Gom-1_0"

inherit rpm
