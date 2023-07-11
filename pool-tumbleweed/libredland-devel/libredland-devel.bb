SUMMARY = "Development package for programs that use Redland"
DESCRIPTION = "Files needed to develop with the Redland RDF library."
LICENSE = "LGPL-2.1-or-later & Apache-2.0"

PV = "1.0.17"

RPM_NAME = "libredland-devel-1.0.17-2.21.aarch64.rpm"
RPM_HASH = "5e044a272ae0ff06c574a6de39781361a51d7759cbdda5687e7db054b21a826c493d4c09703869e4a7e81c11b04a7bb2de302df744d8865086a6290d19c1af13"

RPROVIDES:${PN} += "libredland-devel \
pkgconfig-redland"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
librdf0 \
pkgconfig-raptor2 \
pkgconfig-rasqal"

inherit rpm
