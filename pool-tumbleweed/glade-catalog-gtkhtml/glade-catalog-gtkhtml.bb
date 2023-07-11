SUMMARY = "Lightweight HTML rendering/printing/editing engine -- Catalog for Glade"
DESCRIPTION = "GtkHTML is a lightweight HTML rendering/printing/editing engine. It \
was originally based on KHTMLW, part of the KDE project, but is now \
being developed independently. \
 \
This package provides a catalog for Glade, to allow the use of GtkHTML \
widgets in Glade."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "glade-catalog-gtkhtml-4.10.0-7.4.aarch64.rpm"
RPM_HASH = "07988602e24f736234c4e8be2ed0125b091baf080c307c2abb892b26658bbf61bc14d234309f9dda3c02dae726f3e31b655967b1bc2811ec050a810aa5157e8e"

RPROVIDES:${PN} += "glade-catalog-gtkhtml \
libglade-gtkhtml-editor.so"

RDEPENDS:${PN} += "glade \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgtkhtml-editor-4-0-0"

inherit rpm
