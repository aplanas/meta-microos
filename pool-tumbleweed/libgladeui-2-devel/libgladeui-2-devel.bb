SUMMARY = "Development files for libgladeui"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libgladeui."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "libgladeui-2-devel-3.40.0-2.4.aarch64.rpm"
RPM_HASH = "f67fcc948fec3e6717db94bbc0ca44465244bc3bfad7d5fbfef6bf92374ea1221eb4b23d1650fb843523b89e989e1c22c06f79720611d1719ea5dd8c952f8191"

RPROVIDES:${PN} += "libgladeui-2-devel \
pkgconfig-gladeui-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgladeui-2-13 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Gladeui-2-0"

inherit rpm
