SUMMARY = "Development headers for timezonemap"
DESCRIPTION = "Development headers for timezonemap."
LICENSE = "GPL-3.0-only"

PV = "0.4.4"

RPM_NAME = "timezonemap-devel-0.4.4-2.10.aarch64.rpm"
RPM_HASH = "46de70f1cf358adbb96d5cd3a19bc48653fab0c5daab439b7d9bff20680c6e5cdad68ff3f9ca6f17fbb7bc66a9f4aa390d76a977e393565b7f9327ece0f9fb31"

RPROVIDES:${PN} += "pkgconfig-timezonemap \
timezonemap-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtimezonemap1 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-json-glib-1.0"

inherit rpm
