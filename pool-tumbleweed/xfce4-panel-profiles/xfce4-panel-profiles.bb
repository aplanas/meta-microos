SUMMARY = "Simple application to manage Xfce panel layouts"
DESCRIPTION = "Simple application to manage Xfce panel layouts. \
 \
This tool makes it possible to backup, restore, import, and export panel layouts."
LICENSE = "GPL-3.0-only"

PV = "1.0.13"

RPM_NAME = "xfce4-panel-profiles-1.0.13-2.3.noarch.rpm"
RPM_HASH = "e2cca7cac35654811fa7b5a38f5f90b3035ed068fe6d8ad6429bb709f93be8a179fc78ee10a4f44a269d9cb857e0fcb928775af80b3c6dd29c4c385db799ebe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.xfce.PanelProfiles.desktop) \
metainfo() \
metainfo(org.xfce.PanelProfiles.appdata.xml) \
xfce4-panel-profiles"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python3 \
python3-base \
python3-gobject \
python3-gobject-Gdk \
typelib(GLib) \
typelib(Gio) \
typelib(Gtk) \
typelib(Libxfce4ui) \
xfce4-panel"

inherit rpm
