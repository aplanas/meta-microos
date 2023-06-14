SUMMARY = "A portal frontend service for Flatpak -- Development files"
DESCRIPTION = "A portal frontend service for Flatpak and possibly other desktop containment frameworks. \
 \
xdg-desktop-portal works by exposing a series of D-Bus interfaces known as portals under \
a well-known name (org.freedesktop.portal.Desktop) and object path (/org/freedesktop/portal/desktop). \
 \
This package contains convenience files for developers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.0"

RPM_NAME = "xdg-desktop-portal-devel-1.16.0-1.3.aarch64.rpm"
RPM_HASH = "94c883eda3c8d15c37c9bfb959b426a23e9c02b5063259885d55be5db64ddb716d066ccccca5687c7e7ee78a651c4308de68ea5406efb7af7bbab727f8dcf769"

RPROVIDES:${PN} += "pkgconfig-xdg-desktop-portal \
xdg-desktop-portal-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xdg-desktop-portal"

inherit rpm
