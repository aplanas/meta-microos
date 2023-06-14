SUMMARY = "Implementation of the Infinote collaborative editing protocol"
DESCRIPTION = "libinfinity is an implementation of the Infinote protocol written in \
GObject-based C. Infinote is a protocol for collaborative editing \
multiple documents and is portable to both Windows and Unix-like \
platforms."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libinfinity-0_7-0-0.7.2-4.6.aarch64.rpm"
RPM_HASH = "f4caaaa2afe5c4e18918f2016a68c6b9989fd085b7169854a528a2b273d4c03b6e964da16e9b1c043933894ef0e67d6f7fc38ab4a4813bb045af801aca0c0357"

RPROVIDES:${PN} += "libinfgtk-0.7.so.0 \
libinfinity \
libinfinity-0-7-0 \
libinfinity-0.7.so.0 \
libinfinoted-plugin-manager-0.7.so.0 \
libinftext-0.7.so.0 \
libinftextgtk-0.7.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcairo.so.2 \
libdaemon.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgsasl.so.7 \
libgtk-3.so.0 \
libm.so.6 \
libxml2.so.2"

inherit rpm
