SUMMARY = "Library of C++ templates implementing universal Clifford algebras"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions. \
 \
This package contains the header files required for developing \
applications using the glucat library."
LICENSE = "LGPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "glucat-devel-0.12.0-3.5.aarch64.rpm"
RPM_HASH = "b2255b125cdbc130704c94f799deaee558b7a582cc3c7ddeb154542a4826ec9f17d681897057acf78475fc1a5aa42d1a63fc3a7f60de6483a047fed809e62249"

RPROVIDES:${PN} += "glucat-devel"

RDEPENDS:${PN} += ""

inherit rpm
