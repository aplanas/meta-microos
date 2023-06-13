SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles - Development Files"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "libgupnp-av-devel-0.14.1-3.1.aarch64.rpm"
RPM_HASH = "ac7526aa5dcc873c4370c21ede6424e098346c0ac95531750b9f31b668a5e9bdd9df4070c28b492cfb166818e5eab7260480cdb6f87cfc996fd10c71642e3126"

RPROVIDES:${PN} += "libgupnp-av-devel \
libgupnp-av-devel(aarch-64) \
pkgconfig(gupnp-av-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgupnp-av-1_0-3 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libxml-2.0) \
typelib-1_0-GUPnPAV-1_0"

inherit rpm
