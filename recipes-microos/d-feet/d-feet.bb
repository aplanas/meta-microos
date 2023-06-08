SUMMARY = "Graphical D-Bus Debugger"
DESCRIPTION = "D-Feet is a graphical D-Bus debugger.  D-Bus is an RPC library used on \
the Desktop.  D-Feet can be used to inspect D-Bus objects of running \
programs and invoke methods on those objects."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.16"

RPM_NAME = "d-feet-0.3.16-2.5.noarch.rpm"
RPM_HASH = "e7699c5ee77f72f95850651724d767492f334847fcd63d5ed0aa2f10b75aa578f2323ad01a3675ece67dcbea6697700deba2a826f58ac2d19ca264aba0a47404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.gnome.dfeet.desktop) d-feet metainfo() metainfo(org.gnome.dfeet.appdata.xml)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(Gio) typelib(Gtk) typelib(Wnck)"

inherit rpm
