SUMMARY = "Extra Gtk# bindings"
DESCRIPTION = "Files for developing programs that use gtk-sharp-beans"
LICENSE = "LGPL-2.1-or-later"

PV = "2.14.1"

RPM_NAME = "gtk-sharp-beans-devel-2.14.1-23.12.aarch64.rpm"
RPM_HASH = "f476f0352b141aa978dba0870e15e80750c0ce85da0edafaf9d302f67d73ccfa67cf26a5d8dee2e1165bbde318b846a21242e6b3f9e77738de164f887f5db298"

RPROVIDES:${PN} += "gtk-sharp-beans-devel \
gtk-sharp-beans-devel(aarch-64) \
pkgconfig(gtk-sharp-beans-2.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk-sharp-beans \
pkgconfig(glib-sharp-2.0) \
pkgconfig(gtk-sharp-2.0)"

inherit rpm
