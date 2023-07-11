SUMMARY = "Office files thumbnailer for the GNOME desktop"
DESCRIPTION = "This package provides a thumbnailer for office files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.50"

RPM_NAME = "gsf-office-thumbnailer-1.14.50-1.6.aarch64.rpm"
RPM_HASH = "9e263e8057aecb9ada9a58dc1d131c0f74a38b08a92390da48071b259f97a1fc2398f2fdde2f53f72c9cb0e16a786ea38c1a1d2a13615d688a18e0c17e628bbf"

RPROVIDES:${PN} += "gsf-office-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114"

inherit rpm
