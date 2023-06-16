SUMMARY = "Object database, tag/metadata database, search tool and indexer"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
It consists of a common object database that allows entities to \
have an almost infinite number of properties, metadata (both \
embedded/harvested as well as user definable), a comprehensive \
database of keywords/tags and links to other entities. \
 \
It provides context linking and audit trails for file objects. \
It has the ability to index, store, harvest metadata, retrieve \
and search all types of files and other first class objects."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.3"

RPM_NAME = "tracker-3.5.3-1.1.aarch64.rpm"
RPM_HASH = "624d5cf7583d54765c49eb05d59f5b106aaefbf5542bfe3fa5aa1f46dbf55d45f37168a6c10ea59223bcd4607713d8e97e8aa2ac37b7e553546a56240485fc7b"

RPROVIDES:${PN} += "libtracker-http-soup3.so \
libtracker-parser-libicu.so \
tracker"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libtracker-sparql-3.0.so.0 \
libxml2.so.2 \
tracker-data-files"

inherit rpm
