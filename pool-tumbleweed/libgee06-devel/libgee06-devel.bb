SUMMARY = "GObject-based library providing useful data structures - Development Files"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures."
LICENSE = "LGPL-2.1+"

PV = "0.6.6"

RPM_NAME = "libgee06-devel-0.6.6-5.29.aarch64.rpm"
RPM_HASH = "69cd3824dc257742e9589bc7e48fcd484f45651bb421c0db635b99be9aec6eda9f72590970c722b14a68c9efd70c6a190fc3d1b1656579829ac32e22aa28a79e"

RPROVIDES:${PN} += "libgee06-devel \
pkgconfig-gee-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgee2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Gee-1-0"

inherit rpm
