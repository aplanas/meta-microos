SUMMARY = "Development files for libgladeui"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libgladeui."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "libgladeui-2-devel-3.40.0-2.3.aarch64.rpm"
RPM_HASH = "ae3f10551fb7cf6a7791814360ea48058c36e6184bdbe059967934ff80f3c979ac563e648ad0c2b66475c7c1a5723d29a7cc7422305c2d3f29cb9046dd792eff"

RPROVIDES:${PN} += "libgladeui-2-devel \
libgladeui-2-devel(aarch-64) \
pkgconfig(gladeui-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgladeui-2-13 \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gtk+-3.0) \
typelib-1_0-Gladeui-2_0"

inherit rpm
