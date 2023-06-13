SUMMARY = "The documentation and HTML files for trilinos"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This package contains the Trilinos HTML documentation."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-doc-14.0.0-1.1.noarch.rpm"
RPM_HASH = "b598b03d1bf1c597b5c53e3b311a8cd47c288824b414135c5900ab4a56a752cd19e9e66634a7ebf1a176c5fbf45ee8e8791ab3d794fc9e239515d3aa2b712d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-doc"

RDEPENDS:${PN} += ""

inherit rpm
