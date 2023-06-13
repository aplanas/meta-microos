SUMMARY = "4store RDF Storage Development Files"
DESCRIPTION = "This package provides 4store RDF storage development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.6"

RPM_NAME = "lib4store-devel-1.1.6-3.14.aarch64.rpm"
RPM_HASH = "0e35ccfc2abb96891002be9f43d64fbff55ad1ba225026f4a4d1a6cb8303cd12bc6ed3246379607abdf2ca9c3f1de0f5010383ad8991cad741d742d3d58ad38b"

RPROVIDES:${PN} += "lib4store-devel \
lib4store-devel(aarch-64) \
pkgconfig(4store-0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lib4store0"

inherit rpm
