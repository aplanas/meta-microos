SUMMARY = "A recipe app for GNOME"
DESCRIPTION = "GNOME Recipes is an easy-to-use application that will help you to discover what to cook \
today, tomorrow, rest of the week and for your special occasions. \
 \
Recipes comes with a collection of recipes that have been collected by GNOME contributors \
from all over the world. It also lets you store your own recipes, and share them with your \
friends."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "gnome-recipes-2.0.4-1.18.aarch64.rpm"
RPM_HASH = "59e15a96e48b1cdc9252bf3f31999c286e8c8fbde1bb4d93718b7d9d7006956bfdd12286d09870babe96317972a3089dca715b6047b6651d867e272d2b050917"

RPROVIDES:${PN} += "gnome-recipes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-autoar-0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librest-0.7.so.0 \
libsoup-2.4.so.1"

inherit rpm
