SUMMARY = "Development files for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package contains the files needed for building applications using \
VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.1"

RPM_NAME = "vte-devel-0.72.1-2.2.aarch64.rpm"
RPM_HASH = "03ac586e0d80f844dca301d2f97bee4b1498ada543e2de44575fbeb3e4486b63f8fb81b205a39aca379c6cde8e48a7df55421344eee2ff6c8ece9b812354c895"

RPROVIDES:${PN} += "pkgconfig(vte-2.91) \
pkgconfig(vte-2.91-gtk4) \
vte-devel \
vte-devel(aarch-64) \
vte-doc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvte-2_91-0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(gtk4) \
pkgconfig(pango) \
typelib-1_0-Vte-2_91 \
typelib-1_0-Vte-3_91"

inherit rpm
