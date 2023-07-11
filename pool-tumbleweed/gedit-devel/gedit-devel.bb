SUMMARY = "Development files for the gedit text editor"
DESCRIPTION = "Gedit is a UTF-8 text editor for the GNOME \
environment. \
 \
This subpackage contains the header files for creating gedit plugins."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gedit-devel-44.2-1.5.aarch64.rpm"
RPM_HASH = "5331f7ed3a4da6e09f7691766cbae31d394064988a22dd744591e89c5351091d29f9d84857b3129cc28223934e62a30987f30554b914a0d9c3b4b183cbca7ab0"

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
