SUMMARY = "Documentation for PLplot and its bindings"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the documentation for PLplot and its associated \
modules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-doc-5.15.0-17.1.noarch.rpm"
RPM_HASH = "3b40885e43f6eebdb459a11d09ceda9df079c0c797b56c1dfbfd8d6394116c539291ae1b9f92b2268ca9c45104769588ee0b44f0b87bc295835c3cf097ebf29f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
