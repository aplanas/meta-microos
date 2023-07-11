SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-gtk3-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-gtk3-devel-0.6-1.8.aarch64.rpm"
RPM_HASH = "08fd1f63d60521e8255f5e528deaa96586b80f8757ac8cac18bedaf86649e389b449a570234a5ed86eb5342eb8c95191e918624e34339b46823ac182c324c243"

RPROVIDES:${PN} += "libportal-gtk3-devel \
pkgconfig-libportal-gtk3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-gtk3-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libportal \
typelib-1-0-XdpGtk3-1-0"

inherit rpm
