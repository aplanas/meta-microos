SUMMARY = "Clean and Lean GNOME CD Ripper"
DESCRIPTION = "GStreamer-based CD ripping tool. Saves audio CDs to Ogg/vorbis."
LICENSE = "GPL-2.0-or-later"

PV = "3.38.0"

RPM_NAME = "sound-juicer-3.38.0-3.7.aarch64.rpm"
RPM_HASH = "8ed1ab9d89923b5f692b4fa3f90c9edc0d0f357b25d599e74e452dbfe67752d1e14d9fc5ba7e72fec611614339649f8e022d410eeee34c386eca10a59c03b602"

RPROVIDES:${PN} += "sound-juicer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrasero-media3.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libdiscid.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libmusicbrainz5.so.1 \
libpango-1.0.so.0"

inherit rpm
