SUMMARY = "Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libedataserver-1_2-27-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "39fd6ec02e517ca9dff32680fc450a434af81ea3229f7cf181065f66f4083751e6021c948d210af063c86a575ba09ccdd8b746a82d9c4a935e817f508379ba05"

RPROVIDES:${PN} += "libedataserver-1-2-27 \
libedataserver-1.2.so.27"

RDEPENDS:${PN} += "/sbin/ldconfig \
evolution-data-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libedbus-private.so \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libjson-glib-1.0.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
