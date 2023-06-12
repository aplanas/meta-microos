SUMMARY = "Development files for the GTK+ spell checker library"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the files necessary for developing software using \
gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.1"

RPM_NAME = "gspell-devel-1.12.1-1.2.aarch64.rpm"
RPM_HASH = "4e2e3738508118db84a62f42e772bd741b96d1cb6667f2de20299d84716dec18512ccaf636292f39bdaeac56b38efdf997f1a578878f4e9af4e3bb83aa28cda6"

RPROVIDES:${PN} += "gspell-devel \
gspell-devel(aarch-64) \
pkgconfig(gspell-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgspell-1-2 \
pkgconfig(enchant-2) \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(icu-uc) \
typelib-1_0-Gspell-1"

inherit rpm
