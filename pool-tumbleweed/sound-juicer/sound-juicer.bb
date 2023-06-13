SUMMARY = "Clean and Lean GNOME CD Ripper"
DESCRIPTION = "GStreamer-based CD ripping tool. Saves audio CDs to Ogg/vorbis."
LICENSE = "GPL-2.0-or-later"

PV = "3.38.0"

RPM_NAME = "sound-juicer-3.38.0-3.7.aarch64.rpm"
RPM_HASH = "8ed1ab9d89923b5f692b4fa3f90c9edc0d0f357b25d599e74e452dbfe67752d1e14d9fc5ba7e72fec611614339649f8e022d410eeee34c386eca10a59c03b602"

RPROVIDES:${PN} += "application() \
application(org.gnome.SoundJuicer.desktop) \
metainfo() \
metainfo(org.gnome.SoundJuicer.metainfo.xml) \
mimehandler(x-content/audio-cdda) \
sound-juicer \
sound-juicer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbrasero-media3.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libdiscid.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libmusicbrainz5.so.1()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
