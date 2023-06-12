SUMMARY = "Gedit joinlines plugin"
DESCRIPTION = "The gedit joinlines plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-joinlines-44.1-1.3.aarch64.rpm"
RPM_HASH = "6339b818af869cded139e0657ad64b40ac0e138c6398cc9de61ee3a970539d6038f2924b277e51c9f3c84fc63d10d6765513b27c9a108e823e5449bac6bada3d"

RPROVIDES:${PN} += "gedit-plugin-joinlines \
gedit-plugin-joinlines(aarch-64) \
gedit-plugins:/usr/lib64/gedit/plugins/joinlines.plugin \
metainfo() \
metainfo(gedit-joinlines.metainfo.xml)"
RDEPENDS:${PN} += "gedit-plugins-data \
typelib(GObject) \
typelib(Gedit) \
typelib(Gio) \
typelib(Gtk)"

inherit rpm
