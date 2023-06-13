SUMMARY = "Development Files for Pragha Plugins"
DESCRIPTION = "This package contains development files needed to develop plugins for Pragha."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.99.1"

RPM_NAME = "pragha-plugins-devel-1.3.99.1-3.3.aarch64.rpm"
RPM_HASH = "69ecec15abc4de7dc03ca14c4472a1d41c467938a1db958486806ef2e915fbdd624a6ea8981d37ecf542b2cf463219c0dd3b89be908e0b5ddab96477980c036c"

RPROVIDES:${PN} += "pkgconfig(libpragha) \
pragha-plugins-devel \
pragha-plugins-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(gio-2.0) \
pkgconfig(gstreamer-1.0) \
pkgconfig(gstreamer-base-1.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libpeas-1.0) \
pkgconfig(libpeas-gtk-1.0) \
pkgconfig(taglib_c)"

inherit rpm
