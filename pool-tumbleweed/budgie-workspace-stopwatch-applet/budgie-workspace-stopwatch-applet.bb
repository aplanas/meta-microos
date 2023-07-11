SUMMARY = "Workspace stopwatch applet"
DESCRIPTION = "Workspace Timer Applet is an applet to keep track of usage per workspace, e.g. to find out how much minutes/hours were actually spent on a job. \
Workspaces can be freely named, custom names and all data are rmembered, also after logout/restart, until the RESET button is pressed."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-workspace-stopwatch-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "482d61ee50ea27f83606621691d4dd3e8a2e387864f0c67da7e5e404f70c7085eed7eeea36bde84de88213e33ac1aa880a288cde762d40e200dd87507cc66d3a"

RPROVIDES:${PN} += "budgie-workspace-stopwatch-applet"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk \
typelib-Budgie \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Wnck"

inherit rpm
