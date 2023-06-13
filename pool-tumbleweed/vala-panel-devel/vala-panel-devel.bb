SUMMARY = "Development files for vala-panel"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This is a development package for vala-panel."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-devel-0.5.0-1.6.aarch64.rpm"
RPM_HASH = "99c511b095fe6704ce2759632c595e4ba259afc21fc1de2e40700c1d066767b80099de5a5961de5b591aafbd3632634709fa82544d1a88863269f5ad2ac88fc3"

RPROVIDES:${PN} += "pkgconfig(vala-panel) \
vala-panel-devel \
vala-panel-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libpeas-1.0) \
pkgconfig(libwnck-3.0) \
vala-panel"

inherit rpm
