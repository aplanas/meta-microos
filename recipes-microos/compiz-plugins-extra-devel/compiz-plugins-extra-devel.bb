SUMMARY = "OpenGL window and compositing manager community extra plugins"
DESCRIPTION = "This package contains the community extra Compiz compositing \
manager plugins. \
 \
This package contain development files required for developing \
other plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-extra-devel-0.8.18-1.15.aarch64.rpm"
RPM_HASH = "7e1a037b8ec843583b5482bb337216e58e7b105f799d4d0791b403c36e0cd184e877c3f35f70d94db4862995cdcab826903057af25ef65d40da61b6b38cbda70"

RPROVIDES:${PN} += "compiz-fusion-plugins-extra-devel \
compiz-plugins-extra-devel \
compiz-plugins-extra-devel(aarch-64) \
pkgconfig(compiz-animationaddon)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
compiz-plugins-extra \
pkgconfig \
pkgconfig(bcop) \
pkgconfig(cairo) \
pkgconfig(compiz) \
pkgconfig(compiz-animation) \
pkgconfig(compiz-cube) \
pkgconfig(compiz-mousepoll) \
pkgconfig(compiz-scale) \
pkgconfig(compiz-text) \
pkgconfig(gl) \
pkgconfig(libnotify)"

inherit rpm
