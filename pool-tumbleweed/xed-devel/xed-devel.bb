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

PV = "3.4.3"

RPM_NAME = "xed-devel-3.4.3-1.1.aarch64.rpm"
RPM_HASH = "8928605ebb75d96bb95e89b83eebb44c53d1a5011008e672ad7bc649677d7e1d734245e294b854763bec883eb424873db1c9ac9db1e3444e835b5e1756717306"

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
