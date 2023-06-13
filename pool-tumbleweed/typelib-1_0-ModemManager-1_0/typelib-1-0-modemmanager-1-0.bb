SUMMARY = "Introspection bindings for the modem handling DBus interface"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "typelib-1_0-ModemManager-1_0-1.20.6-1.1.aarch64.rpm"
RPM_HASH = "d142aaefae1b907053781da3c3b59db8edf4fbee659f478d24508ac9454522115bb801f99d8811a31367fb226010172a2c2a163ccc225b761d40a7b24980f96b"

RPROVIDES:${PN} += "typelib(ModemManager) \
typelib-1_0-ModemManager-1_0 \
typelib-1_0-ModemManager-1_0(aarch-64)"

RDEPENDS:${PN} += "libmm-glib.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
