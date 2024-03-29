SUMMARY = "Sparql library for Tracker"
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

RPM_NAME = "libtracker-sparql-3_0-0-3.5.3-1.1.aarch64.rpm"
RPM_HASH = "3dd89d89bd93173e8afa1223d663d8d2ea57a34d054e7930814c46f923abe5fcd618d56ff7352e957924bcfd4945c33f19c453880b7d4e6edd00351ae1cd6990"

RPROVIDES:${PN} += "libtracker-sparql-3-0-0 \
libtracker-sparql-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsqlite3.so.0 \
libxml2.so.2"

inherit rpm
