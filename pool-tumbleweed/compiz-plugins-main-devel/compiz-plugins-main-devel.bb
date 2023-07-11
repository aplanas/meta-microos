SUMMARY = "OpenGL window and compositing manager plugins"
DESCRIPTION = "This package contains the non-default Compiz compositing manager \
plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-main-devel-0.8.18-1.16.aarch64.rpm"
RPM_HASH = "40db3eebaf3b1658fbf10648a360ddf3c573d4740e88c124fc60d2046b8096aa0cb9eecef0f00860e943743f58b80da5a6b2b344c30007b2b2ee8aea346a0230"

RPROVIDES:${PN} += "compiz-fusion-plugins-main-devel \
compiz-plugins-main-devel \
pkgconfig-compiz-animation \
pkgconfig-compiz-focuspoll \
pkgconfig-compiz-mousepoll \
pkgconfig-compiz-text"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
compiz-plugins-main \
pkgconfig-bcop \
pkgconfig-cairo \
pkgconfig-cairo-xlib-xrender \
pkgconfig-compiz \
pkgconfig-compiz-scale \
pkgconfig-gl \
pkgconfig-pangocairo"

inherit rpm
