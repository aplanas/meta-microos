SUMMARY = "Source and header files for libhandy"
DESCRIPTION = "This package provides the source and header files for writing \
software using libhandy, a library to help with developing mobile UI \
using GTK+/GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "libhandy-devel-1.8.2-1.4.aarch64.rpm"
RPM_HASH = "03c91a2719b2c647f0e0116c996d5410837c87e9400ad515f7704b7472696b8fe3f99ff404e4ef71ff752fdf83750f617b6831b1af4f44c14d8caf14aec9d202"

RPROVIDES:${PN} += "libhandy-devel \
pkgconfig-libhandy-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhandy-1-0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Handy-1-0"

inherit rpm
