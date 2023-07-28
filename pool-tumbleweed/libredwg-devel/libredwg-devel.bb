SUMMARY = "Development files for libredwg"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD. \
 \
This package contains the files required for development with libredwg."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5.5907"

RPM_NAME = "libredwg-devel-0.12.5.5907-1.1.aarch64.rpm"
RPM_HASH = "515e21ea7f1d98da60a4291a7450693c8cfa61f2c3e912b4f4b373ed2ff8ee76b0baecca961f844d9e0dbd3c09fcf7a7c4227f3265ae7fe1711532d20a4217ad"

RPROVIDES:${PN} += "libredwg-devel \
pkgconfig-libredwg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libredwg0"

inherit rpm
