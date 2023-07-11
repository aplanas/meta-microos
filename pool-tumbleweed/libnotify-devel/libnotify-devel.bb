SUMMARY = "Notifications Library"
DESCRIPTION = "D-BUS notifications library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libnotify-devel-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "3c6108f8b3f1eb713e76417159296611fed1f7bd1f8ce5181f4350a2edafb38134d435ea7abb54bfcadb9670acae0d3f4a50244e0101465c5fe44820791a3d45"

RPROVIDES:${PN} += "libnotify-devel \
libnotify-doc \
pkgconfig-libnotify"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotify4 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Notify-0-7"

inherit rpm
