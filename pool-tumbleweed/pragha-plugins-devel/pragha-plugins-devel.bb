SUMMARY = "Development Files for Pragha Plugins"
DESCRIPTION = "This package contains development files needed to develop plugins for Pragha."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.99.1"

RPM_NAME = "pragha-plugins-devel-1.3.99.1-3.4.aarch64.rpm"
RPM_HASH = "13d444a88456762e70298539bf927b8f061f051619ab39404c0822ce8e0e7221762d2feac25e0098d79b309f0325960900c4dbc39d7879d87c828380de66d4ef"

RPROVIDES:${PN} += "pkgconfig-libpragha \
pragha-plugins-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libpeas-1.0 \
pkgconfig-libpeas-gtk-1.0 \
pkgconfig-taglib-c"

inherit rpm
