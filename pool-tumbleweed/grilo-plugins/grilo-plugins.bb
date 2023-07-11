SUMMARY = "Media and metadata plugins for the Grilo framework"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides plugins for accessing content from various media \
providers, including podcasts, Apple trailers, Flickr, \
Jamendo, Vimeo, YouTube."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-plugins-0.3.16-1.2.aarch64.rpm"
RPM_HASH = "d714501ee5d209fc42b62c3e14b22cd866a500560032fb2800eae22823380fd4285b5a417eed347ac9f1f6098aa78512a29186438c5cbc4e82fe06ccc2f81761"

RPROVIDES:${PN} += "grilo-plugins \
libgrlbookmarks.so \
libgrlchromaprint.so \
libgrldaap.so \
libgrldpap.so \
libgrlfilesystem.so \
libgrlflickr.so \
libgrlfreebox.so \
libgrlgravatar.so \
libgrllocalmetadata.so \
libgrlluafactory.so \
libgrlmagnatune.so \
libgrlmetadatastore.so \
libgrlopticalmedia.so \
libgrlpodcasts.so \
libgrlraitv.so \
libgrlshoutcast.so \
libgrlthetvdb.so \
libgrltmdb.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libavahi-client.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libdmapsharing-4.0.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgom-1.0.so.0 \
libgrilo-0.3.so.0 \
libgrlnet-0.3.so.0 \
libgrlpls-0.3.so.0 \
libgstreamer-1.0.so.0 \
libjson-glib-1.0.so.0 \
liblua5.4.so.5 \
libmediaart-2.0.so.0 \
liboauth.so.0 \
libsqlite3.so.0 \
libtotem-plparser-mini.so.18 \
libtotem-plparser.so.18 \
libxml2.so.2"

inherit rpm
