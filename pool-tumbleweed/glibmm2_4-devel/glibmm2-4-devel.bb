SUMMARY = "C++ Interface for GLib"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.66.6"

RPM_NAME = "glibmm2_4-devel-2.66.6-1.2.aarch64.rpm"
RPM_HASH = "c305364cc3265180d7c310bd2a00b9ad0b1e71f160d1b450a5b4239666844f081b14d72437738715167b8255428086f0fa2f58032288b9452d1325f5977d9d4e"

RPROVIDES:${PN} += "glibmm2-4-devel \
glibmm2-4-doc \
glibmm2-devel \
glibmm24-devel \
perl-DocsParser \
perl-Enum \
perl-Function \
perl-FunctionBase \
perl-GtkDefs \
perl-GtkDefs--Function \
perl-GtkDefs--Signal \
perl-Object \
perl-Output \
perl-Property \
perl-Util \
perl-WrapParser \
pkgconfig-giomm-2.4 \
pkgconfig-glibmm-2.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgiomm-2-4-1 \
libglibmm-2-4-1 \
pkgconfig-gio-2.0 \
pkgconfig-glibmm-2.4 \
pkgconfig-gobject-2.0 \
pkgconfig-sigc++-2.0"

inherit rpm
