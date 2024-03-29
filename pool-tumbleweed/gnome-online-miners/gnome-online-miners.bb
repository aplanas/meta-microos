SUMMARY = "Crawls through your online content"
DESCRIPTION = "GNOME Online Miners provides a set of crawlers that go through \
your online content and index them locally in Tracker. It has miners for \
Flickr, Google, OwnCloud and SkyDrive."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "gnome-online-miners-3.34.0-2.9.aarch64.rpm"
RPM_HASH = "86e8d659a10f6e205af539a86fc559d9482aa1cadc002811e2bf7c2e588521a9f6d25b0797c0de64ba082ab3d272ff3c00b22ed1c7811668034ded57696cc729"

RPROVIDES:${PN} += "dbus-org.gnome.OnlineMiners.Flickr \
dbus-org.gnome.OnlineMiners.GData \
dbus-org.gnome.OnlineMiners.Owncloud \
dbus-org.gnome.OnlineMiners.Zpj \
gnome-online-miners \
libgom-1.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdata.so.22 \
libgfbgraph-0.2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0 \
libtracker-sparql-3.0.so.0 \
libzapojit-0.0.so.0"

inherit rpm
