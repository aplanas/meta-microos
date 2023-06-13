SUMMARY = "Photo viewer for GNOME"
DESCRIPTION = "Photos, like Documents, Music and Videos, is one of the core GNOME \
applications meant for find and reminding the user about her content. \
The internal architecture Photos is based on Documents -- the document \
manager application for GNOME, because they share similar UI/UX \
patterns and objectives."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-photos-44.0-1.1.aarch64.rpm"
RPM_HASH = "66572765179e42a8754db2893d0c62005ef5eef6ce6a65aaf188d92fcb67a40b1af424dbaf66d4f42690bb11c381e800203cb7fd1f82ab8433116ede3ab6804e"

RPROVIDES:${PN} += "application() \
application(org.gnome.Photos.desktop) \
gnome-photos \
gnome-photos(aarch-64) \
libgnome-photos.so()(64bit) \
metainfo() \
metainfo(org.gnome.Photos.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libbabl-0.1.so.0()(64bit) \
libbabl-0.1.so.0(V0_1_0)(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libdazzle-1.0.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgegl-0.4.so.0()(64bit) \
libgeocode-glib-2.so.0()(64bit) \
libgexiv2.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgoa-1.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libportal-gtk3.so.1()(64bit) \
libportal.so.1()(64bit) \
libtracker-sparql-3.0.so.0()(64bit) \
tracker \
tracker-miner-files"

inherit rpm
