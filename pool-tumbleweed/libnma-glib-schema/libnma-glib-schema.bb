SUMMARY = "GLib-schema org.gnome.nm-applet.eap"
DESCRIPTION = "The glib-schema allows libnma to be configured wia dconf \
 \
It is required by libnma"
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-glib-schema-1.10.6-1.4.noarch.rpm"
RPM_HASH = "a5648322d951e68091ad5c7eb72ce785667e55c480d02de17badcf3af9147b830cca8e834bf90a140148e9ca90421e2d20cf642959bae7d8766d766fd46606eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnma-glib-schema"

RDEPENDS:${PN} += ""

inherit rpm
