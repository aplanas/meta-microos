SUMMARY = "GTK Widgets for Viewing EXIF Information"
DESCRIPTION = "This library contains GTK widgets for viewing EXIF information within \
JPEG images created by some digital cameras."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "libexif-gtk-devel-0.5.0-1.13.aarch64.rpm"
RPM_HASH = "d0dba9cc3c1904dd7ded11623ec279e510069058047ae86a92491cf4d7b894d45abdd84f3db48e405dd9b68cc89bca24714447452724cc2ce0ccda8af313a566"

RPROVIDES:${PN} += "libexif-gtk-devel \
pkgconfig-libexif-gtk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-devel \
libexif-devel \
libexif-gtk \
pkgconfig-gtk+-2.0 \
pkgconfig-libexif"

inherit rpm
