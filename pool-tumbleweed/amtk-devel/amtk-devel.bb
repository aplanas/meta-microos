SUMMARY = "Development files for Tepl, a text editor framework"
DESCRIPTION = "“Actions, Menus and Toolbars Kit” or just AMTK is a basic \
GtkUIManager replacement based on GAction, suitable for \
both a traditional UI or a modern UI with a GtkHeaderBar. \
 \
This package provides all the necessary files for development \
with AMTK."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "amtk-devel-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "cc3374810aca94ed37cd68a8d7d96ea5d483b0e857f152e24fff5626877c5f9bd99e3500b8873357ab837167d4cd6ee6238241fe2f7f24f2364ed77c1a1efc19"

RPROVIDES:${PN} += "amtk-devel \
amtk-devel(aarch-64) \
pkgconfig(amtk-5)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libamtk-5-0 \
pkgconfig(gio-2.0) \
pkgconfig(gtk+-3.0) \
typelib-1_0-Amtk-5"

inherit rpm
