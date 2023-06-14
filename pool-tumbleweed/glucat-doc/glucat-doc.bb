SUMMARY = "Documentation for glucat-main"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions. \
 \
This package provides the documentation for glucat-main."
LICENSE = "LGPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "glucat-doc-0.12.0-3.3.aarch64.rpm"
RPM_HASH = "d69c576481dda4f45299920d069655ae7ad625171b9f8e0d184d04d7a5cad14735ebf8aed967b179d478f6b07c226060fcc780177aacd0685ece26969bcf458d"

RPROVIDES:${PN} += "glucat-doc"

RDEPENDS:${PN} += ""

inherit rpm
