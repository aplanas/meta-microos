SUMMARY = "Caja extension to enable an embedded terminal"
DESCRIPTION = "Caja Terminal is an embedded terminal for Caja, the MATE file \
manager. It embeds a terminal pane into Caja that is accessible by \
a hotkey (Ctrl+Shift+T) and automatically follows the currently \
active directory in Caja."
LICENSE = "GPL-3.0-or-later"

PV = "0.10"

RPM_NAME = "caja-extension-terminal-0.10-3.6.noarch.rpm"
RPM_HASH = "cf9f71fb23e6be9a2d80333edc8b47bd872ff63d6dd7f5e300f46695e2cb8cde617d8d988e60610d0ec4a953a1d03d28c1661c321bf0f8b65f2ee1e3e1b1708e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-terminal"

RDEPENDS:${PN} += "/usr/bin/python3 \
caja \
python-caja \
python3-gobject \
python3-gobject-Gdk \
python3-pyxdg \
typelib-Caja \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gtk \
typelib-Pango \
typelib-Vte"

inherit rpm
