SUMMARY = "A GObject-based Exiv2 wrapper"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.2"

RPM_NAME = "libgexiv2-2-0.14.2-1.1.aarch64.rpm"
RPM_HASH = "bba77437cda62aae7222711a4739037d01f7a0bf4cb8a1e41bcc0cc81a8bc701c336ba843827ee3dcffa3c959884becccad696051ef07896c45e3e4fc1b6ccda"

RPROVIDES:${PN} += "libgexiv2-2 \
libgexiv2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
