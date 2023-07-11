SUMMARY = "Libpurple plugin for SkypeWeb API"
DESCRIPTION = "This is a SkypeWeb Plugin for libpurple. It lets you view and chat \
with all your Skype buddies from within Pidgin."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "libpurple-plugin-skypeweb-1.7-1.4.aarch64.rpm"
RPM_HASH = "d830acf23a9330eff39bce9b99777c1d732275e95b155711d991b30096aca81a6fa4a9252311a665a818aa10345970f28df9b7287271dc0bd24d0c97a5b043f9"

RPROVIDES:${PN} += "libpurple-plugin-skypeweb \
libskypeweb.so"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpurple.so.0 \
libz.so.1"

inherit rpm
