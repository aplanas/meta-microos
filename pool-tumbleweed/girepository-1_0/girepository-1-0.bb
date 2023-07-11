SUMMARY = "Base GObject Introspection Bindings"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "LGPL-2.1-or-later"

PV = "1.76.1"

RPM_NAME = "girepository-1_0-1.76.1-2.2.aarch64.rpm"
RPM_HASH = "e14e30461bb7b974b064ab113b688e4e3eb6dae6890865b927d68d65239c0ed04e90cbd220ecb2d9af66340a010456c9f09bcc8c1ea5566fc833f7ca16f4234d"

RPROVIDES:${PN} += "girepository-1-0 \
typelib-DBus \
typelib-DBusGLib \
typelib-GIRepository \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Vulkan \
typelib-cairo \
typelib-fontconfig \
typelib-freetype2 \
typelib-libxml2 \
typelib-win32 \
typelib-xfixes \
typelib-xft \
typelib-xlib \
typelib-xrandr"

RDEPENDS:${PN} += "libgirepository-1-0-1"

inherit rpm
