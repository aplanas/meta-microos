SUMMARY = "Development files for the modem handling DBus interface"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "ModemManager-devel-1.20.6-1.2.aarch64.rpm"
RPM_HASH = "be8192d147cab328d4e48450eafc40f7bd4f2a9e3bcb7801fc445bde20ab27a92c79f4d77c6c9c3b5f9a6a3c052e40c5ed60352f04da750ec465a0253a60c191"

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
