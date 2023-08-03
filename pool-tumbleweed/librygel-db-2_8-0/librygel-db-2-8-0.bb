SUMMARY = "Database library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the database library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-db-2_8-0-0.42.3-2.1.aarch64.rpm"
RPM_HASH = "7f0841b74e126262bc041c70e778b6437d7b5bdba11de2157f7e4519d87f0771b9c78af09adb04a2b4939251e1d2c3135d4ebe4b7e63fdf9fc61aff6780c18d4"

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
