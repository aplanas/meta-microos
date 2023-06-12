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

PV = "1.90.0"

RPM_NAME = "typelib-1_0-UpowerGlib-1_0-1.90.0-1.4.aarch64.rpm"
RPM_HASH = "01cf2d40ee2271dd5a368ca2792088543180442b9bcfe6ee7932925f4ce660e05036883be66a111853a345e1a6cdd5bed26daaf41a7a967f4dd83d9b4f5aa9f3"

RPROVIDES:${PN} += "typelib(UPowerGlib) \
typelib-1_0-UpowerGlib-1_0 \
typelib-1_0-UpowerGlib-1_0(aarch-64)"
RDEPENDS:${PN} += "libupower-glib.so.3()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
