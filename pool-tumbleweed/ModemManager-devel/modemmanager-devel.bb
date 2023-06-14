SUMMARY = "Development files for the modem handling DBus interface"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "ModemManager-devel-1.20.6-1.1.aarch64.rpm"
RPM_HASH = "ea4d9710263d71d6925bef7cf6c9822d496ceb08c5cfaae36089a5a860e18cbe7a5338e5ecaf0a4807e35dba6289170e088014186a077291124493609ff599e8"

RPROVIDES:${PN} += "ModemManager-devel \
pkgconfig-ModemManager \
pkgconfig-mm-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ModemManager \
libmm-glib0 \
pkgconfig-ModemManager \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-ModemManager-1-0"

inherit rpm
