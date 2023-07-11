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

RPM_NAME = "glucat-doc-0.12.0-3.5.aarch64.rpm"
RPM_HASH = "2e3d63e6fbf9c78f4387e5fbdf7916c975248a774b080e765c87fbd45ae3bf38fda9a1671b6e934ad75bd0cb5b20038ca5967039f32e29633e7eb16778085184"

RPROVIDES:${PN} += "glucat-doc"

RDEPENDS:${PN} += ""

inherit rpm
