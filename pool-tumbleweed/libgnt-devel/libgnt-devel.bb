SUMMARY = "Development files of GNT"
DESCRIPTION = "GNT is an ncurses toolkit for creating text-mode graphical user \
interfaces. \
 \
The GNT development package includes the header files, libraries, \
and development tools necessary for compiling and linking \
applications which will use GNT."
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "libgnt-devel-2.14.3-1.8.aarch64.rpm"
RPM_HASH = "e01628b632070d8a9e9c433964061915eb121e59a464d359df79e01e7cec6f0bb10b9a18ef75fd41679331a4e9434bfbbb82f5928c9a5090448a02818ca3573d"

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
