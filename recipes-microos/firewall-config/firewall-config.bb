SUMMARY = "Firewall configuration application"
DESCRIPTION = "The firewall configuration application provides an configuration interface for \
firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewall-config-1.3.2-1.1.noarch.rpm"
RPM_HASH = "40141ead41a99a55488331bc7f4c226709ef1cc1091af51dc03898c805e5e260d798a55c9f612963ef8fa58fba9fc27229a95ff8d902e804a821bf4fefd59147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(firewall-config.desktop) firewall-config metainfo() metainfo(firewall-config.appdata.xml)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 firewalld hicolor-icon-theme python3-gobject-Gdk typelib(GLib) typelib(GObject) typelib(Gdk) typelib(Gio) typelib(Gtk) typelib(Pango)"

inherit rpm
