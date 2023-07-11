SUMMARY = "GTK menu for sway and i3"
DESCRIPTION = "An attempt to create a simple menu, that behaves decently on sway, \
but also on i3 window manager. It uses pygobject to create a themeable, \
searchable gtk3-based system menu w/ some optional features."
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "sgtk-menu-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "0f9171af9d4a34dad89a5d223c390352c4aba203d0efef9bbac073b4eeee8118d18e23e5333d7602103c9062101808f79d44d6facf6ab0419de98f744c344e97"

RPROVIDES:${PN} += "python3.11dist-sgtk-menu \
python3dist-sgtk-menu \
sgtk-menu"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject"

inherit rpm
