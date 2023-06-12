SUMMARY = "Evolution Data Server's Calendar Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access calendars."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libecal-2_0-2-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "9a1a2a64cbf1e5a6edd2cca4402e5dad6bab5517ffc2869a33d7c05d1a1ad81ed553dfc2ce1f72dd4a4a035d55954a6b6bbd3a900566aad525c57ea428097eed"

RPROVIDES:${PN} += "libecal-2.0.so.2()(64bit) \
libecal-2_0-2 \
libecal-2_0-2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcamel-1.2.so.64()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libedbus-private.so()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libical-glib.so.3()(64bit) \
libical.so.3()(64bit)"

inherit rpm
