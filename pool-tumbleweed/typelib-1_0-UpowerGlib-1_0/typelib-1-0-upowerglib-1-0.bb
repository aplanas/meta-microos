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

PV = "1.90.1"

RPM_NAME = "typelib-1_0-UpowerGlib-1_0-1.90.1-1.1.aarch64.rpm"
RPM_HASH = "1b066a8d7b857f7e9ba8bf577ac6ea63b2cdf1a93f3c5e4a60be0840e2956ccf9aaec29f32fc42cb1396c5f7cdebb387df497e429c11252353ddd46c9a3c9619"

RPROVIDES:${PN} += "typelib-1-0-UpowerGlib-1-0 \
typelib-UPowerGlib"

RDEPENDS:${PN} += "libupower-glib.so.3 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
