SUMMARY = "Development files for Nemo"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment. \
 \
This package provides the development files for Nemo."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.4"

RPM_NAME = "nemo-devel-5.6.4-1.3.aarch64.rpm"
RPM_HASH = "ecbb8b3ceaff40faa2efe724c9c9db0d4e8f91701b67bbfeedbbde578edc9a8d23ac4018c7402a0ca9bc3e71d6b6ae1a6363217bcf0861189079eb0bc05b2859"

RPROVIDES:${PN} += "nemo-devel \
pkgconfig-libnemo-extension"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnemo-extension1 \
nemo \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Nemo-3-0"

inherit rpm
