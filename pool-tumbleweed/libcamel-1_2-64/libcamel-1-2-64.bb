SUMMARY = "Evolution Data Server's Messaging Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for messaging."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libcamel-1_2-64-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "7c953d02ea9c5e2f9bb324cdff47cc43d7bd13cd12a3c20016f8860a366d051812ff9e3120f8da161eeced0e7d70a3b15528f10939a711499ff21f2af5f3a286"

RPROVIDES:${PN} += "libcamel-1-2-64 \
libcamel-1.2.so.64"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssapi-krb5.so.2 \
libicuuc.so.73 \
libnspr4.so \
libnss3.so \
libsmime3.so \
libsqlite3.so.0 \
libssl3.so \
libz.so.1"

inherit rpm
