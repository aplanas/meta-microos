SUMMARY = "Lasso development headers and documentation"
DESCRIPTION = "This package contains the header files, static libraries and development \
documentation for Lasso."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.2"

RPM_NAME = "liblasso-devel-2.8.2-1.4.aarch64.rpm"
RPM_HASH = "233d639cac9867e27da5e8cb571890b722777097300356155cc3798df23470926e688139de4a9ef0c4395f340e13ff2e7206cec4ad2c0d1bb36e3c95c20d6993"

RPROVIDES:${PN} += "liblasso-devel \
pkgconfig-lasso"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblasso3 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-xmlsec1"

inherit rpm
