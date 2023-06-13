SUMMARY = "Development files for mxml"
DESCRIPTION = "Mini-XML is a small XML parsing library that you can use to read XML \
and XML-like data files in your application without requiring large \
nonstandard libraries. \
 \
This package holds the development files for mxml."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "mxml-devel-3.3.1-1.3.aarch64.rpm"
RPM_HASH = "d1f47ca203a54191763d9edc60204e35949486f5e2a8473cec42a6d5ad663cc21c619fa3bbd709b2b060b90b29cac20fbb92580ba380edc71dd0547336a4cb11"

RPROVIDES:${PN} += "mxml-devel \
mxml-devel(aarch-64) \
pkgconfig(mxml)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmxml1"

inherit rpm
