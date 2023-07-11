SUMMARY = "Introspection bindings for the modem handling DBus interface"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "typelib-1_0-ModemManager-1_0-1.20.6-1.2.aarch64.rpm"
RPM_HASH = "94fe7652e66128007e1ffd02932f65e51f4e87e343fbc23aabd35cacfab51798df9b314e656277bdf0b326195468488abfb425878ebc9a866ec84fcf8b818a3e"

RPROVIDES:${PN} += "typelib-1-0-ModemManager-1-0 \
typelib-ModemManager"

RDEPENDS:${PN} += "libmm-glib.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
