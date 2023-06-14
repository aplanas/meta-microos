SUMMARY = "Documentation for PLplot and its bindings"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the documentation for PLplot and its associated \
modules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-doc-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "ad55f4ae85c1e3da1f9260eebac35cc56c471f70fb7f8663e05a3a976f607c46c0ab4245e06acf66dd244a791a7be16a29e972e6407a54238af4868338a5ad3b"

RPROVIDES:${PN} += "plplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
