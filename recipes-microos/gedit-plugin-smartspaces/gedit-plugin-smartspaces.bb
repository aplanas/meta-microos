SUMMARY = "Gedit smartspaces plugin"
DESCRIPTION = "The gedit smartspaces plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-smartspaces-44.1-1.3.aarch64.rpm"
RPM_HASH = "116946af708071820bb907edb3f424edd50efcf8afe186be157860a48e0faa9b6b2945255bee58b6fc7762ee46b6d908597dac7995076f2eb460cabc5e7c738c"

RPROVIDES:${PN} += "gedit-plugin-smartspaces gedit-plugin-smartspaces(aarch-64) gedit-plugins:/usr/lib64/gedit/plugins/smartspaces.plugin libsmartspaces.so()(64bit) metainfo() metainfo(gedit-smartspaces.metainfo.xml)"
RDEPENDS:${PN} += "gedit-plugins-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgedit-44.so()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtksourceview-4.so.0()(64bit) libpeas-1.0.so.0()(64bit)"

inherit rpm
