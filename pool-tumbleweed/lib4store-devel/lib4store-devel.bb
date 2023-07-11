SUMMARY = "4store RDF Storage Development Files"
DESCRIPTION = "This package provides 4store RDF storage development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.6"

RPM_NAME = "lib4store-devel-1.1.6-3.15.aarch64.rpm"
RPM_HASH = "16f310ea57c56948b539f242d01c9b23cc8e1802c476674774378839575d12c42563d21f393feea64c1cd9b3b13b5bc69465a4ceb6c2a7922580537416ad06ec"

RPROVIDES:${PN} += "lib4store-devel \
pkgconfig-4store-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lib4store0"

inherit rpm
