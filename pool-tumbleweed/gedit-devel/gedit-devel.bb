SUMMARY = "Development files for the gedit text editor"
DESCRIPTION = "Gedit is a UTF-8 text editor for the GNOME \
environment. \
 \
This subpackage contains the header files for creating gedit plugins."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gedit-devel-44.2-1.4.aarch64.rpm"
RPM_HASH = "5a33b5f039e0220339326c98cd20bd344d9868dd3b8e8c69f6e1f4d93216f69a09f0893a2b29328cdaa2a8a2bc33dc3ade15a8865cf067b5d60925bfdfe66154"

RPROVIDES:${PN} += "gedit-devel \
gedit-doc \
gedit2-devel \
pkgconfig-gedit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gedit \
gtksourceview-devel \
pkgconfig-amtk-5 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libpeas-gtk-1.0 \
pkgconfig-tepl-6 \
python3-gedit"

inherit rpm
