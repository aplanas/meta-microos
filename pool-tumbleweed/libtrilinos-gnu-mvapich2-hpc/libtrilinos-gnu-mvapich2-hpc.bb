SUMMARY = "Dependency package for libtrilinos_14_0_0-gnu-mvapich2-hpc"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package libtrilinos-gnu-mvapich2-hpc provides the dependency to get binary package libtrilinos_14_0_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-mvapich2-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos-gnu-mvapich2-hpc-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "908371c9c0cbe551b715d6ea2fd5792a93d4f43d23fee65352584fba48a4746040e868649c9d55d3bf7d582f38fac45940bf431625e158ebf219aa80f07563a3"

RPROVIDES:${PN} += "libtrilinos-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libtrilinos-14-0-0-gnu-mvapich2-hpc"

inherit rpm
