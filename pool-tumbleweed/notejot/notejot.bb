SUMMARY = "A Sticky Note App"
DESCRIPTION = "A sticky notes application for any type of short term notes \
or ideas."
LICENSE = "GPL-3.0-only"

PV = "3.4.9"

RPM_NAME = "notejot-3.4.9-1.7.aarch64.rpm"
RPM_HASH = "507c2ee024338ecab34af7de609e7fe00fd7f79268a1862dcff6799b10370880c93727e535e25277ae0cf988ca6482e7999c575bc832bb99dc2d9fb31a878cbd"

RPROVIDES:${PN} += "notejot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0"

inherit rpm
