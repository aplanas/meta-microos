SUMMARY = "Previews applet"
DESCRIPTION = "Provides window previews capabilities for the Budgie Desktop"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-previews-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "097090e0f93c67d927cd6779efbac4bef7308b862859b3e17df5dc413e2aa3e168b89c28ad6f00d14a89dc0e2e9507cfc4dd82b4fbd7e7e5d9615cb7ec64f138"

RPROVIDES:${PN} += "application() \
application(org.ubuntubudgie.previewscontrols.desktop) \
budgie-previews \
budgie-previews(aarch-64) \
metainfo() \
metainfo(org.ubuntubudgie.previewscontrols.metainfo.xml)"

RDEPENDS:${PN} += "budgie-extras-daemon \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libwnck-3.so.0()(64bit) \
xinput \
xprintidle"

inherit rpm
