SUMMARY = "Gedit drawspaces plugin"
DESCRIPTION = "The gedit drawspaces plugin."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-drawspaces-44.1-1.3.aarch64.rpm"
RPM_HASH = "625c0d5e314f4c6b366ad225771b77e26ac0c592c13aae7e85d4d2a4893f84422bc148942692d52ab1e58fe24f23d435c8f2dc962f1a3521ab073bea55446495"

RPROVIDES:${PN} += "gedit-plugin-drawspaces gedit-plugin-drawspaces(aarch-64) gedit-plugins:/usr/lib64/gedit/plugins/drawspaces.plugin libdrawspaces.so()(64bit) metainfo() metainfo(gedit-drawspaces.metainfo.xml)"
RDEPENDS:${PN} += "gedit-plugins-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgedit-44.so()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtksourceview-4.so.0()(64bit) libpeas-1.0.so.0()(64bit) libpeas-gtk-1.0.so.0()(64bit) libtepl-6.so.2()(64bit)"

inherit rpm
