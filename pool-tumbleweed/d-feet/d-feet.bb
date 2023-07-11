SUMMARY = "Graphical D-Bus Debugger"
DESCRIPTION = "D-Feet is a graphical D-Bus debugger.  D-Bus is an RPC library used on \
the Desktop.  D-Feet can be used to inspect D-Bus objects of running \
programs and invoke methods on those objects."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.16"

RPM_NAME = "d-feet-0.3.16-2.6.noarch.rpm"
RPM_HASH = "631cc2a5235c2bb66eb38e61ea075d4bcfe5b03c72fa3a33e6249c55608674a536b76fe2a441a22c5d4ab967474f31d2b9596140faf2f1199431741f382dd2c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "d-feet"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Wnck"

inherit rpm
