SUMMARY = "Library for Rendering PostScript Documents"
DESCRIPTION = "libspectre is a small library for rendering Postscript documents. It \
provides a convenient easy to use API for handling and rendering \
Postscript documents."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "libspectre-devel-0.2.12-1.4.aarch64.rpm"
RPM_HASH = "789cb768468badb191f21d73331f58da9036183ad186caf646cad34b1f7126dbb97d0b5bddfd8d2d68235946972b34c5788a119b06955ce563454455c10bcb4a"

RPROVIDES:${PN} += "libspectre-devel \
pkgconfig-libspectre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ghostscript-devel \
libspectre1"

inherit rpm
