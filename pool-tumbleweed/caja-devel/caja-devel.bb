SUMMARY = "Caja development files"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "caja-devel-1.26.1-1.4.aarch64.rpm"
RPM_HASH = "0852ff0c282887470ab94ce404273d08f4d0397d3604b44d5414a57faaf8512df65d1322fb20d65ef2b8e53bdf589c4daa34ad85a4acbaaa40892283701e9298"

RPROVIDES:${PN} += "caja-devel \
caja-devel(aarch-64) \
mate-file-manager-devel \
pkgconfig(libcaja-extension)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
caja \
libcaja-extension1 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0)"

inherit rpm
