SUMMARY = "Brasero miscellaneous utility function library"
DESCRIPTION = "Brasero is an application to burn CD/DVDs for the GNOME Desktop. It is \
 \
This subpackage contains a library of Brasero with utility functions \
that did not fit in the other two categories (brasero-burn, \
brasero-media)."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "libbrasero-utils3-1-3.12.3-2.7.aarch64.rpm"
RPM_HASH = "bf5417d714f447cbbbd5bbc43f96d731892523526589d474497749a116850404b5a59b8023a35aac0e8a375189f6331251e430f2de566852432c2029e9441d9d"

RPROVIDES:${PN} += "libbrasero-utils3-1 \
libbrasero-utils3-1(aarch-64) \
libbrasero-utils3.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libtotem-plparser.so.18()(64bit)"

inherit rpm
