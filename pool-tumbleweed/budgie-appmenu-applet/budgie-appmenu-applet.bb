SUMMARY = "Application Menu plugin for budgie"
DESCRIPTION = "This is Global Menu plugin for using with BUDGIE Panel."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "budgie-appmenu-applet-0.7.6-2.1.aarch64.rpm"
RPM_HASH = "a8f9ec2cc6c5c255758141c1dd86979b4d9333d9cf4ccb7b395576dd9a09f14ea666eb43b3a3e4d7d3a50ab83cccab41c592e9dd23b6e58a616a089fd6b100e8"

RPROVIDES:${PN} += "budgie-appmenu-applet \
libappmenu-budgie.so"

RDEPENDS:${PN} += "libbudgie-plugin.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
