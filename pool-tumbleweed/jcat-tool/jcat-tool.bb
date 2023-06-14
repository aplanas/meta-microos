SUMMARY = "Optional tool for libjcat"
DESCRIPTION = "This package provides the optional jcat-tool for libjcat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.13"

RPM_NAME = "jcat-tool-0.1.13-1.1.aarch64.rpm"
RPM_HASH = "633e968b032f7841c14213924959d8b40f2548f73e54f38ff1490eb45aee97752ab4efa7746f8897e6442913b078bb402b1cfc1b479ab8a956e8f14849985703"

RPROVIDES:${PN} += "jcat-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgpgme.so.11 \
libhogweed.so.6 \
libjcat.so.1 \
libjson-glib-1.0.so.0"

inherit rpm
