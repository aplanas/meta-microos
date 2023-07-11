SUMMARY = "Lightweight HTML rendering/printing/editing engine -- Development Files"
DESCRIPTION = "GtkHTML is a lightweight HTML rendering/printing/editing engine. It \
was originally based on KHTMLW, part of the KDE project, but is now \
being developed independently. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "gtkhtml-devel-4.10.0-7.4.aarch64.rpm"
RPM_HASH = "73eb75ff5ef17459d5423b0d4f5150f2ba116d67fc0fe15dfa581a8708c4543d73068f86ca2eee267c77de0db13581e06168835d16040abb46e8791206b29917"

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
