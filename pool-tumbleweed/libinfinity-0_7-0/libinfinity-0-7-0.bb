SUMMARY = "Implementation of the Infinote collaborative editing protocol"
DESCRIPTION = "libinfinity is an implementation of the Infinote protocol written in \
GObject-based C. Infinote is a protocol for collaborative editing \
multiple documents and is portable to both Windows and Unix-like \
platforms."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libinfinity-0_7-0-0.7.2-4.7.aarch64.rpm"
RPM_HASH = "a38a841b088bf86043ab380caf29cbfbf25b0a72ef5d4da06f70e05bef8aa21fdc228ea123600e3988afe51f93bae7dd8ba102897d7883c8a0d88b4f17e34c6d"

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
