SUMMARY = "Database library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the database library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "librygel-db-2_8-0-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "ef6bc543f548927b3aabe663c629b2a4551c6ea65138ebc7a3f6ee9394f1b3cbeba4bbf9c7aec61ed39e9ec01a4db5f33a416a62d9e7c9a9b3b0cf4b316241da"

RPROVIDES:${PN} += "librygel-db-2-8-0 \
librygel-db-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librygel-core-2.8.so.0 \
libsqlite3.so.0 \
libunistring.so.5"

inherit rpm
