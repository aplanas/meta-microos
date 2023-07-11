SUMMARY = "Documentation for o2scl"
DESCRIPTION = "O2scl is a C++ library for object-oriented numerical programming. \
This package provides the documentation for o2scl."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "o2scl-doc-0.926-3.6.aarch64.rpm"
RPM_HASH = "5298986abd6384f602683da82cc9ea10e8734f2b414cef381a07e29eff0306548fd099348f9c200256a8eb0b60f205a1327d401c570c395862edb3c2dc5e05eb"

RPROVIDES:${PN} += "o2scl-doc"

RDEPENDS:${PN} += ""

inherit rpm
