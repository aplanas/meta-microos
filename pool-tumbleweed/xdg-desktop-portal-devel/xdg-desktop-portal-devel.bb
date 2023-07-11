SUMMARY = "A portal frontend service for Flatpak -- Development files"
DESCRIPTION = "A portal frontend service for Flatpak and possibly other desktop containment frameworks. \
 \
xdg-desktop-portal works by exposing a series of D-Bus interfaces known as portals under \
a well-known name (org.freedesktop.portal.Desktop) and object path (/org/freedesktop/portal/desktop). \
 \
This package contains convenience files for developers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.0"

RPM_NAME = "xdg-desktop-portal-devel-1.16.0-2.1.aarch64.rpm"
RPM_HASH = "a416d8cbfddf16d758cf804ac933c20cc3fd393040f7b6c5126a0e95c13133054addd76d0198b1a05fdff9dfc7e6627ecfc53a2d88486e37151660fd8e389f60"

RPROVIDES:${PN} += "pkgconfig-xdg-desktop-portal \
xdg-desktop-portal-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xdg-desktop-portal"

inherit rpm
