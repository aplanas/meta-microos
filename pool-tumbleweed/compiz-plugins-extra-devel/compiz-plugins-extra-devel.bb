SUMMARY = "OpenGL window and compositing manager community extra plugins"
DESCRIPTION = "This package contains the community extra Compiz compositing \
manager plugins. \
 \
This package contain development files required for developing \
other plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-extra-devel-0.8.18-1.16.aarch64.rpm"
RPM_HASH = "2341d7007cdf389726ecdb1feb9a7841544e390a08d952369dd870a4acad7d1e9888b68c991ea85eabb9383e5ed30e397b1e65244afc5f00c885937c165eb7eb"

RPROVIDES:${PN} += "compiz-fusion-plugins-extra-devel \
compiz-plugins-extra-devel \
pkgconfig-compiz-animationaddon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
compiz-plugins-extra \
pkgconfig \
pkgconfig-bcop \
pkgconfig-cairo \
pkgconfig-compiz \
pkgconfig-compiz-animation \
pkgconfig-compiz-cube \
pkgconfig-compiz-mousepoll \
pkgconfig-compiz-scale \
pkgconfig-compiz-text \
pkgconfig-gl \
pkgconfig-libnotify"

inherit rpm
