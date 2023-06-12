SUMMARY = "C++ Interface for GLib"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.66.6"

RPM_NAME = "glibmm2_4-devel-2.66.6-1.1.aarch64.rpm"
RPM_HASH = "f1874c476d3c02b5a6da17efa8cd4ce74b4d7d90967b068b418d9d8f01de1c330990d5a38cb3e7ac49fb823f2034ee055f595d5daa5a349463f345c8c468d8f7"

RPROVIDES:${PN} += "glibmm2-devel \
glibmm24-devel \
glibmm2_4-devel \
glibmm2_4-devel(aarch-64) \
glibmm2_4-doc \
perl(DocsParser) \
perl(Enum) \
perl(Function) \
perl(FunctionBase) \
perl(GtkDefs) \
perl(GtkDefs::Function) \
perl(GtkDefs::Signal) \
perl(Object) \
perl(Output) \
perl(Property) \
perl(Util) \
perl(WrapParser) \
pkgconfig(giomm-2.4) \
pkgconfig(glibmm-2.4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgiomm-2_4-1 \
libglibmm-2_4-1 \
pkgconfig(gio-2.0) \
pkgconfig(glibmm-2.4) \
pkgconfig(gobject-2.0) \
pkgconfig(sigc++-2.0)"

inherit rpm
