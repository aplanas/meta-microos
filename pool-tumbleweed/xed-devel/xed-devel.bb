SUMMARY = "Development files for Xed, a text editor"
DESCRIPTION = "xed is a text editor designed for the Cinnamon desktop. It has most \
standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, printing and editing of multiple \
documents in one window. \
 \
xed is extensible through a plugin system, which currently \
includes support for spell checking, comparing files, viewing VCS \
ChangeLogs, and adjusting indentation levels."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.8"

RPM_NAME = "xed-devel-3.2.8-1.4.aarch64.rpm"
RPM_HASH = "87680b7d7a56570468075576c99e8f5834d0ce486c79b79cceaafa161c4043474353d3f1c5a65caee0445e98e757e289a27fef30963184db508b4c9b339406ba"

RPROVIDES:${PN} += "pkgconfig-xed \
xed-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtksourceview-3.0 \
pkgconfig-gtksourceview-4 \
pkgconfig-libpeas-1.0 \
pkgconfig-libpeas-gtk-1.0 \
pkgconfig-libxml-2.0 \
pkgconfig-x11 \
pkgconfig-xapp \
xed"

inherit rpm
