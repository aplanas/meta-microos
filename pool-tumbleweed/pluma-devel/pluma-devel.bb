SUMMARY = "Headers for Pluma, a UTF-8 text editor"
DESCRIPTION = "Pluma is a text editor designed specifically for the MATE desktop. It \
has standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, and printing and editing of multiple \
documents in one window."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "pluma-devel-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "9343c6d02d86d2441fb624bca59ee91ff9fb8bf5616c88b9f947bc58068f72bd1d26336c1889f0443bb8812d051f900beaa0b238eac46af805075ec4fcb97296"

RPROVIDES:${PN} += "pkgconfig-pluma \
pluma-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gtksourceview-3.0 \
pkgconfig-gtksourceview-4 \
pkgconfig-libpeas-1.0 \
pkgconfig-libpeas-gtk-1.0 \
pluma \
typelib-1-0-Pluma-1-0"

inherit rpm
