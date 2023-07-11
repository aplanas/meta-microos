SUMMARY = "Introspection bindings for libmsi, a library to inspect and build .msi files"
DESCRIPTION = "libmsi is a port of (and a subset of) Wine's implementation of the Windows \
Installer."
LICENSE = "LGPL-2.1-or-later"

PV = "0.102"

RPM_NAME = "typelib-1_0-Libmsi-1_0-0.102-1.1.aarch64.rpm"
RPM_HASH = "5fd439359d39b13cad3372f770a3d3cdf1f5a10a1504d9a899046da8bb52d54b68201a0e0be53209846c51f83d92f6f74cafc2f3e72f6a720018a34edf33a7c3"

RPROVIDES:${PN} += "typelib-1-0-Libmsi-1-0 \
typelib-Libmsi"

RDEPENDS:${PN} += "libmsi.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
