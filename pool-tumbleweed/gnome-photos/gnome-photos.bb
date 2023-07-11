SUMMARY = "Photo viewer for GNOME"
DESCRIPTION = "Photos, like Documents, Music and Videos, is one of the core GNOME \
applications meant for find and reminding the user about her content. \
The internal architecture Photos is based on Documents -- the document \
manager application for GNOME, because they share similar UI/UX \
patterns and objectives."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-photos-44.0-1.2.aarch64.rpm"
RPM_HASH = "e7683ac100ec60b07040661d49c4ea9d896c5e8ff6209d023541b603d8d0118ff468380517fdd860e3825305b01eacca9e7bdda4128d649f100cb3f8c788602d"

RPROVIDES:${PN} += "gnome-photos \
libgnome-photos.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libbabl-0.1.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdazzle-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgegl-0.4.so.0 \
libgeocode-glib-2.so.0 \
libgexiv2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libportal-gtk3.so.1 \
libportal.so.1 \
libtracker-sparql-3.0.so.0 \
tracker \
tracker-miner-files"

inherit rpm
