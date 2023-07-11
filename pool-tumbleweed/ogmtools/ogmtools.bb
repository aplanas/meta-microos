SUMMARY = "Tools for OGG Media Streams"
DESCRIPTION = "These tools allow information about (ogminfo), extraction from \
(ogmdemux), creation of (ogmmerge), or the division of (ogmsplit) OGG \
media streams.	OGM stands for OGG media streams."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ogmtools-1.5-168.8.aarch64.rpm"
RPM_HASH = "11894c49d9a1dec6f70f39b98ba9283e70cf048f5b0cda7b88e2995f402c70afc209288788a4b9aa2a1f5c1810e67fe4d00afa9f417744da760b566ea4eaa902"

RPROVIDES:${PN} += "ogmtools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdvdread.so.8 \
libgcc-s.so.1 \
libogg.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
