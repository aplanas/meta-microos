SUMMARY = "DDE API golang codes"
DESCRIPTION = "The deepin-api is DDE API provides some dbus interfaces that is used for screen \
zone detecting, thumbnail generating, sound playing, etc. \
 \
This package contains library source intended forbuilding other packages which \
use import path with pkg.deepin.io/dde/api prefix."
LICENSE = "GPL-3.0+"

PV = "5.5.25"

RPM_NAME = "golang-github-linuxdeepin-dde-api-5.5.25-1.5.noarch.rpm"
RPM_HASH = "b7251e00f8aee4c3b619642031fbf977384a3f404e3ff052cda275c57b4b562ad242d430b084cf9f865cdf88dd73f6868ce1fb3eb83fc6f7f85a1b34c321d0c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-dde-api"

RDEPENDS:${PN} += "deepin-gir-generator \
golang-github-linuxdeepin-go-dbus-factory \
golang-github-linuxdeepin-go-lib \
golang-github-linuxdeepin-go-x11-client \
pkgconfig(alsa) \
pkgconfig(cairo-ft) \
pkgconfig(gdk-pixbuf-xlib-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(gudev-1.0) \
pkgconfig(libcanberra) \
pkgconfig(libpulse-simple) \
pkgconfig(librsvg-2.0) \
pkgconfig(polkit-qt5-1) \
pkgconfig(poppler-glib) \
pkgconfig(systemd) \
pkgconfig(x11) \
pkgconfig(xcursor) \
pkgconfig(xfixes) \
pkgconfig(xi)"

inherit rpm
