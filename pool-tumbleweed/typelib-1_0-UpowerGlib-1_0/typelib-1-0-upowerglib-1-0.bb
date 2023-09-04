SUMMARY = "Power Device Enumeration Framework - Introspection bindings"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit. \
 \
This package provides the GObject Introspection bindings for \
libupower-glib."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.2"

RPM_NAME = "typelib-1_0-UpowerGlib-1_0-1.90.2-1.1.aarch64.rpm"
RPM_HASH = "0ef4a7eb1fd2a572f1fddbb70237ea8b9977fa0651ad6c733cc4cb3c5c393356a50c2bda072da4bb02e28dda087c7eea79ba20b205fd3dc9bb68df38cf018e66"

RPROVIDES:${PN} += "typelib-1-0-UpowerGlib-1-0 \
typelib-UPowerGlib"

RDEPENDS:${PN} += "libupower-glib.so.3 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
