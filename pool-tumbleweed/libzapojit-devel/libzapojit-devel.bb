SUMMARY = "Library for the SkyDrive and Hotmail REST APIs -- Development Files"
DESCRIPTION = "This package provides the files necessary for developing applications \
using libzapojit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.3"

RPM_NAME = "libzapojit-devel-0.0.3-8.4.aarch64.rpm"
RPM_HASH = "07acc5fa495f7f08bf935baaff4edaccbb6f88e694ec78f50964dfe7c384813950346c1602d37d418c0e0424e19ddaef81f9d890561bd03577bd63630d1300d2"

RPROVIDES:${PN} += "libzapojit-devel \
pkgconfig-zapojit-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzapojit-0-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-goa-1.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libsoup-2.4 \
pkgconfig-rest-0.7 \
typelib-1-0-Zpj-0-0"

inherit rpm
