SUMMARY = "Lightweight HTML rendering/printing/editing engine -- Catalog for Glade"
DESCRIPTION = "GtkHTML is a lightweight HTML rendering/printing/editing engine. It \
was originally based on KHTMLW, part of the KDE project, but is now \
being developed independently. \
 \
This package provides a catalog for Glade, to allow the use of GtkHTML \
widgets in Glade."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "glade-catalog-gtkhtml-4.10.0-7.3.aarch64.rpm"
RPM_HASH = "bc9013bd1b0076634ec7c00272124a0acf0eb7517c7cbaeb843032d83cd87eea68c74f952971d863de064d550acb8bf6ff112c8066c37e128cc52e47aca1c7d4"

RPROVIDES:${PN} += "glade-catalog-gtkhtml \
libglade-gtkhtml-editor.so"

RDEPENDS:${PN} += "glade \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgtkhtml-editor-4-0-0"

inherit rpm
