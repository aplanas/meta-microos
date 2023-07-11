SUMMARY = "Clean and Lean GNOME CD Ripper"
DESCRIPTION = "GStreamer-based CD ripping tool. Saves audio CDs to Ogg/vorbis."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "sound-juicer-3.40.0-1.1.aarch64.rpm"
RPM_HASH = "d6d6e5f395efa6e3d264b9113ac575c88fd1a38290cc66a39b2cb36ff095fac1e126f90cfcbe6fda276f750482cd46cbb8287df1d95e774b666223fae0e746e4"

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
