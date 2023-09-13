SUMMARY = "Development files for the gcab cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides development files to build code against \
libgcab."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "gcab-devel-1.6-1.1.aarch64.rpm"
RPM_HASH = "fcd83b8501632725b331235b571973b6fc2cab0657783cb2d4d980b5c073cfa9ecefaea8f42d08a957dfa713a55a14fdbc25f874551ee7ff200dc95c5cbb2e31"

RPROVIDES:${PN} += "gcab-devel \
pkgconfig-libgcab-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcab-1-0-0 \
pkgconfig-gio-2.0"

inherit rpm
