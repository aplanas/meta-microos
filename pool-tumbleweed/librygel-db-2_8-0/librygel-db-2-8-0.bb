SUMMARY = "Database library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the database library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-db-2_8-0-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "b489cc0591975abc76043085ad9352f3fbc98594b4a0806e2cb550add962e60858b2263f229c5458783836093cf2638bf18ca8e603dea97c89c51a020fb440bd"

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
