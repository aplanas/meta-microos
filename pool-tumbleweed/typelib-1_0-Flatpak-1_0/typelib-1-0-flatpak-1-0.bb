SUMMARY = "Introspection bindings for the flatpak library"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "typelib-1_0-Flatpak-1_0-1.14.4-1.3.aarch64.rpm"
RPM_HASH = "79f0ce8d324d12c4114741fc06bd9e4cde42bff728e418b7067b7fc5d1b56d5d1935cf2d32ddd0a9eb267e68493cafe2909d595eff315f71481fb99e78f7c8fe"

RPROVIDES:${PN} += "typelib-1-0-Flatpak-1-0 \
typelib-Flatpak"

RDEPENDS:${PN} += "libflatpak.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
