SUMMARY = "Glade Library Compatible with the GNOME 2.x Desktop Platform"
DESCRIPTION = "This library allows you to load Glade interface files in a program at \
runtime. It does not require that you use Glade, but Glade is the \
easiest way to create the interface files.  For an idea of how to use \
the library, see the documentation, especially \
/usr/share/doc/packages/libglade/test-libgladee.c and the glade-xml.h \
include, which is in the libglade package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.4"

RPM_NAME = "libglade-2_0-0-2.6.4-28.3.aarch64.rpm"
RPM_HASH = "67108cc66badb8ecba2b73936b33382de8042d053d2fcc7bdb73aabc39c3b69f43d844cf1ab055719784c6ea9b74851d7a6eb25e76020398d955d2cce5f25b5a"

RPROVIDES:${PN} += "libglade-2-0-0 \
libglade-2.0.so.0 \
libglade2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libxml2.so.2"

inherit rpm
