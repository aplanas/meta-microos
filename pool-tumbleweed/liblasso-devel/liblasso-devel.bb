SUMMARY = "Lasso development headers and documentation"
DESCRIPTION = "This package contains the header files, static libraries and development \
documentation for Lasso."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.2"

RPM_NAME = "liblasso-devel-2.8.2-1.3.aarch64.rpm"
RPM_HASH = "26320cdbf80cca4cea3b0a0fba83d493fe585a614e575a7909fc46deaa55329d4a4a1378cb8c5b8d4a062a7271de216887a5e7d0edba2e2d74aedc7502889c71"

RPROVIDES:${PN} += "liblasso-devel \
liblasso-devel(aarch-64) \
pkgconfig(lasso)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblasso3(aarch-64) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libxml-2.0) \
pkgconfig(libxslt) \
pkgconfig(xmlsec1)"

inherit rpm
