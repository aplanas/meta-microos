SUMMARY = "Development files for the Cheese webcam booth"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "cheese-devel-44.0.1-1.1.aarch64.rpm"
RPM_HASH = "389c92a6715b714c7fed7f1c53d48f236cfcaae04d1a1b84ace23336e161e431f385adec0e431a97bb9d93074624198b69db9d2f8739d5b1b24523ea1bf553a5"

RPROVIDES:${PN} += "cheese-devel \
cheese-devel(aarch-64) \
pkgconfig(cheese) \
pkgconfig(cheese-gtk)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcheese-gtk25 \
libcheese8 \
pkgconfig(clutter-1.0) \
pkgconfig(clutter-gst-3.0) \
pkgconfig(clutter-gtk-1.0) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gstreamer-1.0) \
pkgconfig(gstreamer-pbutils-1.0) \
pkgconfig(gstreamer-plugins-bad-1.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(x11) \
typelib-1_0-Cheese-3_0"

inherit rpm
