SUMMARY = "Development files for the GTK+ spell checker library"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the files necessary for developing software using \
gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "gspell-devel-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "aeb51c81c44a7fd9d5e6dc7fd340186cd4878208896e107489705dceb6444c959a81a8b86e8c72f609c4cbbaec1458c8288a7382718a3dd66c3acf049127fac1"

RPROVIDES:${PN} += "gspell-devel \
pkgconfig-gspell-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgspell-1-2 \
pkgconfig-enchant-2 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-icu-uc \
typelib-1-0-Gspell-1"

inherit rpm
