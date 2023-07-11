SUMMARY = "Development files for the gcab cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides development files to build code against \
libgcab."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "gcab-devel-1.5-1.6.aarch64.rpm"
RPM_HASH = "e2dac173d6fc84bcb80bf23c160353ff7b2fb470031a87fb36f690bba09b8c1239ea23a9eed299ec1f20726bb25d91acf511a11615f688506f5b8b30de713a5b"

RPROVIDES:${PN} += "gcab-devel \
pkgconfig-libgcab-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcab-1-0-0 \
pkgconfig-gio-2.0"

inherit rpm
