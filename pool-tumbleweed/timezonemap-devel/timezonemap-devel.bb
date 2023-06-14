SUMMARY = "Development headers for timezonemap"
DESCRIPTION = "Development headers for timezonemap."
LICENSE = "GPL-3.0-only"

PV = "0.4.4"

RPM_NAME = "timezonemap-devel-0.4.4-2.9.aarch64.rpm"
RPM_HASH = "0ede5bae547c36a1401f29d010c66ae96c4eef4ed4bac57abc974577f3389ad812702398697a2f64733376beb19a11ed97a3e80311e6e2326f73acd8b71198e8"

RPROVIDES:${PN} += "pkgconfig-timezonemap \
timezonemap-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtimezonemap1 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-json-glib-1.0"

inherit rpm
