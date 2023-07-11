SUMMARY = "Development files for pango, a library for text layout and rendering"
DESCRIPTION = "Pango is a library for layout and rendering of text, with an emphasis \
on internationalization. It can be used anywhere that text layout \
is needed. \
 \
Pango forms the core of text and font handling for GTK+. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.50.14"

RPM_NAME = "pango-devel-1.50.14-1.4.aarch64.rpm"
RPM_HASH = "e5ef51cc897bd3b816e56b3864815f7c88e1a90b9bf7022571e04b966aa80403fb0ef0fd0b874067eed5587ae100252fff2fc4c43f0bde87b1326d71b89e866e"

RPROVIDES:${PN} += "pango-devel \
pango-doc \
pkgconfig-pango \
pkgconfig-pangocairo \
pkgconfig-pangofc \
pkgconfig-pangoft2 \
pkgconfig-pangoot \
pkgconfig-pangoxft \
rpm-macro-pango-module-post \
rpm-macro-pango-module-postun \
rpm-macro-pango-module-requires"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpango-1-0-0 \
pkgconfig-cairo \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-harfbuzz \
pkgconfig-harfbuzz-gobject \
pkgconfig-libthai \
pkgconfig-pango \
pkgconfig-pangoft2 \
pkgconfig-xft \
pkgconfig-xrender \
typelib-1-0-Pango-1-0"

inherit rpm
