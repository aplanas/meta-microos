SUMMARY = "Dock applet for the MATE panel"
DESCRIPTION = "An application dock applet for the MATE panel. \
 \
The applet allows you to: \
 * Place a dock on any MATE panel, of any size, on any side of the \
   desktop you desire. \
 * Pin and unpin applications to the dock. \
 * Rearrange application icons on the dock. \
 * Launch applications by clicking on their icons in the dock. \
 * Minimise/restore the running application windows by clicking the \
   applications dock icon. \
 * Detect changes in the current icon theme and update the dock \
   accordingly. \
 * Use an indicator by each application to show when it is running. \
 * Optionally, use multiple indicators for each window an \
   application has opened. \
 * Use either a light or dark indicator that it can always be seen \
   no matter what colour the panel is."
LICENSE = "GPL-2.0-or-later"

PV = "21.10.0"

RPM_NAME = "mate-applet-dock-21.10.0-1.7.aarch64.rpm"
RPM_HASH = "e0170521c6e325b7494d08bbeac7040b65b6839d5e3cb46e127f8002c30b5ca929c76b616db32ee31a5ea2e70a5fbc2bf9b6049d30a70769eb9979727eb42760"

RPROVIDES:${PN} += "mate-applet-dock"

RDEPENDS:${PN} += "/usr/bin/python3 \
bamf-daemon \
python3-Pillow \
python3-cairo \
python3-distro \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-python-xlib \
python3-pyxdg \
typelib-Bamf \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-MatePanelApplet \
typelib-Notify \
typelib-Pango \
typelib-Wnck"

inherit rpm
