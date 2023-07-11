SUMMARY = "Development files for the Glib C++ API"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.0"

RPM_NAME = "glibmm2-devel-2.76.0-1.2.aarch64.rpm"
RPM_HASH = "c12dc20ab81dd05cdbf6b07a04cc17aa011c6ff3d2d15a36b1a34610e8da5f5dccca9e03372919010fd9c72f043100ec7dd1858216ea4e8a15e7b9a63e064af8"

RPROVIDES:${PN} += "glibmm2-devel \
glibmm2-doc \
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
pkgconfig-giomm-2.68 \
pkgconfig-glibmm-2.68"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgiomm-2-68-1 \
libglibmm-2-68-1 \
pkgconfig-gio-2.0 \
pkgconfig-glibmm-2.68 \
pkgconfig-gobject-2.0 \
pkgconfig-sigc++-3.0"

inherit rpm
