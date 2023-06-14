SUMMARY = "Lightweight HTML rendering/printing/editing engine -- Development Files"
DESCRIPTION = "GtkHTML is a lightweight HTML rendering/printing/editing engine. It \
was originally based on KHTMLW, part of the KDE project, but is now \
being developed independently. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "gtkhtml-devel-4.10.0-7.3.aarch64.rpm"
RPM_HASH = "3d26e02e0a159ba327fa48bd0d3b5c942c0cc91e802609eb6726ce00bba2a1cec9666045dc8ac4f88061dbeb467839462e6fe6ca3265910538dd2b9038e35157"

RPROVIDES:${PN} += "gtkhtml-devel \
gtkhtml2-devel \
pkgconfig-gtkhtml-editor-4.0 \
pkgconfig-libgtkhtml-4.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkhtml-4-0-0 \
libgtkhtml-4.0.so.0 \
libgtkhtml-editor-4-0-0 \
libgtkhtml-editor-4.0.so.0 \
pkgconfig-cairo \
pkgconfig-enchant \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-gtk+-3.0 \
pkgconfig-iso-codes \
pkgconfig-libgtkhtml-4.0"

inherit rpm
