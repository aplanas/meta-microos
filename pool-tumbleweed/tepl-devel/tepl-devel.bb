SUMMARY = "Development files for Tepl, a text editor framework"
DESCRIPTION = "Tepl is a library that eases the development of GtkSourceView-based text \
editors and IDEs. It is a continuation/rename of Gtef. \
 \
This subpackage contains the header files for developing \
applications that want to make use of tepl."
LICENSE = "LGPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "tepl-devel-6.4.0-1.5.aarch64.rpm"
RPM_HASH = "eb37424bb4e142f5bb0624619f1dc2180d28b61cf660269b3b63dbe2cb43c5f3a40b90895ec0647494e8f60ce4fbfe99c5c615a877691dc00aaafcc15ff3a514"

RPROVIDES:${PN} += "pkgconfig-tepl-6 \
tepl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtepl-6-2 \
pkgconfig-amtk-5 \
pkgconfig-gio-2.0 \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-gtk+-3.0 \
pkgconfig-gtksourceview-4 \
pkgconfig-icu-i18n \
pkgconfig-icu-uc \
typelib-1-0-Tepl-6"

inherit rpm
