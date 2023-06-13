SUMMARY = "A recipe app for GNOME"
DESCRIPTION = "GNOME Recipes is an easy-to-use application that will help you to discover what to cook \
today, tomorrow, rest of the week and for your special occasions. \
 \
Recipes comes with a collection of recipes that have been collected by GNOME contributors \
from all over the world. It also lets you store your own recipes, and share them with your \
friends."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "gnome-recipes-2.0.4-1.17.aarch64.rpm"
RPM_HASH = "8a48efe562154565a8a5c2f8f4bcd1a8cdbd16dc6bdea8f1edef2de15140d251141230165673345b1375b9038d9fb52b051adb7f6bd598202e67fd494c91c2fe"

RPROVIDES:${PN} += "application() \
application(org.gnome.Recipes.desktop) \
gnome-recipes \
gnome-recipes(aarch-64) \
metainfo() \
metainfo(org.gnome.Recipes.appdata.xml) \
mimehandler(application/vnd.gnome.recipes.export)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcanberra.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-autoar-0.so.0()(64bit) \
libgoa-1.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgspell-1.so.2()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
librest-0.7.so.0()(64bit) \
libsoup-2.4.so.1()(64bit)"

inherit rpm
