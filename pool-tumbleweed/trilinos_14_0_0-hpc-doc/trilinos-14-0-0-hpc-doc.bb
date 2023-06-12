SUMMARY = "The documentation and HTML files for trilinos_14_0_0-hpc"
DESCRIPTION = "Trilinos is a collection of compatible software packages that support parallel \
linear algebra computations, solution of linear, non-linear and eigen systems \
of equations and related capabilities. The majority of packages are written in \
C++ using object-oriented techniques. All packages are self-contained, with the \
Trilinos top layer providing a common look-and-feel and infrastructure. \
 \
This package contains the Trilinos HTML documentation."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos_14_0_0-hpc-doc-14.0.0-1.1.noarch.rpm"
RPM_HASH = "320ffc69002ba0439e73f8dc9735f9678267f6ee653f2006e751c0c3349b35b318212a24eec296386eda2d92e6426ef5da27dfc029e24cb7f4939bba86248ebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos_14_0_0-hpc-doc"
RDEPENDS:${PN} += ""

inherit rpm
