SUMMARY = "Development files of GNT"
DESCRIPTION = "GNT is an ncurses toolkit for creating text-mode graphical user \
interfaces. \
 \
The GNT development package includes the header files, libraries, \
and development tools necessary for compiling and linking \
applications which will use GNT."
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "libgnt-devel-2.14.3-1.7.aarch64.rpm"
RPM_HASH = "b7ab166f40d0b239b6724e4b9c0885846cca92197f7a13bbd2698fa4668d3d6d9ee74d120033a32e02f4cb86fe8f99b1379c59c177f9461962e9e6f499bfd4d7"

RPROVIDES:${PN} += "libgnt-devel \
pkgconfig-gnt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnt.so.0 \
libgnt0 \
libgobject-2.0.so.0 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0"

inherit rpm
