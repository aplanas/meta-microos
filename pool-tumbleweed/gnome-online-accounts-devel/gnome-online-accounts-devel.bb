SUMMARY = "GNOME service to access online accounts -- Development Files"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.48.0"

RPM_NAME = "gnome-online-accounts-devel-3.48.0-1.1.aarch64.rpm"
RPM_HASH = "a4a4cb5056b8cd98232cac2be3908f4e0fe7fa3f8c20a3a13d2a1454644d67ccea6ad4091fb29e22b6173369aa00fa0817f0aab9754906c1e23372f0df0679d8"

RPROVIDES:${PN} += "gnome-online-accounts-devel \
gnome-online-accounts-devel(aarch-64) \
pkgconfig(goa-1.0) \
pkgconfig(goa-backend-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgoa-1_0-0 \
libgoa-backend-1_0-1 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(goa-1.0) \
pkgconfig(gtk+-3.0) \
typelib-1_0-Goa-1_0"

inherit rpm
