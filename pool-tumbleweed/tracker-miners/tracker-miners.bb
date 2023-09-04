SUMMARY = "Various miners for Tracker"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
These are the sources for the various miners (e.g. files, rss)"
LICENSE = "GPL-2.0-or-later"

PV = "3.5.2"

RPM_NAME = "tracker-miners-3.5.2-3.1.aarch64.rpm"
RPM_HASH = "f16b405a0513b2cf0ba06358d14c9cf598ab3ddf5ebb8c9a782b9bd9a28a6b63377781b6f1e3762c57445be5de2b0d387bbedc92b27a6aec143c95d2d8f9a28b"

RPROVIDES:${PN} += "libextract-abw.so \
libextract-bmp.so \
libextract-desktop.so \
libextract-disc-generic.so \
libextract-dummy.so \
libextract-epub.so \
libextract-gif.so \
libextract-gstreamer.so \
libextract-html.so \
libextract-icon.so \
libextract-iso.so \
libextract-jpeg.so \
libextract-mp3.so \
libextract-msoffice-xml.so \
libextract-msoffice.so \
libextract-oasis.so \
libextract-pdf.so \
libextract-playlist.so \
libextract-png.so \
libextract-ps.so \
libextract-raw.so \
libextract-text.so \
libextract-tiff.so \
libextract-xps.so \
libtracker-extract.so \
libwriteback-gstreamer.so \
libwriteback-xmp.so \
tracker-miners"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcue.so.2 \
libexempi.so.8 \
libexif.so.12 \
libgexiv2.so.2 \
libgif.so.7 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgxps.so.2 \
libicui18n.so.73 \
libiptcdata.so.0 \
libjpeg.so.8 \
libm.so.6 \
libosinfo-1.0.so.0 \
libpng16.so.16 \
libpoppler-glib.so.8 \
libseccomp.so.2 \
libtiff.so.6 \
libtotem-plparser.so.18 \
libtracker-sparql-3.0.so.0 \
libxml2.so.2 \
tracker \
tracker-data-files"

inherit rpm
