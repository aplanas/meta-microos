SUMMARY = "Evolution Data Server's Messaging Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for messaging."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "libcamel-1_2-64-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "323d998334cc3ae9db2fec5b91efae209ec2eb2d2ed46ec7a652864788763d954e7fec060a2b328cb690b6611e5e1f24198a47232b5017f9986723e2225bb776"

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
