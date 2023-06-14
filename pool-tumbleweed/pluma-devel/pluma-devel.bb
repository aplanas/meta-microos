SUMMARY = "Headers for Pluma, a UTF-8 text editor"
DESCRIPTION = "Pluma is a text editor designed specifically for the MATE desktop. It \
has standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, and printing and editing of multiple \
documents in one window."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "pluma-devel-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "a1daccbb51f9f6ecd4f69140b18fa16665f12bae0124f7b04fa978dac8ced551c7b11d99ecf4bf718b79b595f526bd3ab78b24df8451baa97da0c7344378bcf0"

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
