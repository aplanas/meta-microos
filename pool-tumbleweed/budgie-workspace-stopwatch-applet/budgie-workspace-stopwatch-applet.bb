SUMMARY = "Workspace stopwatch applet"
DESCRIPTION = "Workspace Timer Applet is an applet to keep track of usage per workspace, e.g. to find out how much minutes/hours were actually spent on a job. \
Workspaces can be freely named, custom names and all data are rmembered, also after logout/restart, until the RESET button is pressed."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-workspace-stopwatch-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "254ece327a2aea12e8f019c4f7842e29d8fb39fc7f92b5632058f02584d9dedd31d5fc5a0f50b546318e77acb226c38f17d9e9a197cfe396912d3205cf1f949d"

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
