SUMMARY = "OpenGL window and compositing manager plugins"
DESCRIPTION = "This package contains the non-default Compiz compositing manager \
plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-main-devel-0.8.18-1.15.aarch64.rpm"
RPM_HASH = "4a4a37b4ed63d9af9beaff970494ba27cf875b301b4c1a45af7dc6eecbeacdbdc536119424751ea8fd513819797e12f80d4a6605395172f0d30e7607e7b2d407"

RPROVIDES:${PN} += "compiz-fusion-plugins-main-devel compiz-plugins-main-devel compiz-plugins-main-devel(aarch-64) pkgconfig(compiz-animation) pkgconfig(compiz-focuspoll) pkgconfig(compiz-mousepoll) pkgconfig(compiz-text)"
RDEPENDS:${PN} += "/usr/bin/pkg-config compiz-plugins-main pkgconfig(bcop) pkgconfig(cairo) pkgconfig(cairo-xlib-xrender) pkgconfig(compiz) pkgconfig(compiz-scale) pkgconfig(gl) pkgconfig(pangocairo)"

inherit rpm
