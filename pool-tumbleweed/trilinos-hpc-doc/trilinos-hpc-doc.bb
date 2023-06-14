SUMMARY = "Dependency package for trilinos_14_0_0-hpc-doc"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package trilinos-hpc-doc provides the dependency to get binary package trilinos_14_0_0-hpc-doc. \
When this package gets updated it installs the latest version of trilinos_14_0_0-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-hpc-doc-14.0.0-1.1.noarch.rpm"
RPM_HASH = "8f2726454ff3aee626c9334666e1545005ded9d77decdebbffd2fdcae987dcb320aaddb7bc4fa7f5d6e99793284932e62b841bb91df98e0714bcc7f08c482bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-hpc-doc"

RDEPENDS:${PN} += "trilinos-14-0-0-hpc-doc"

inherit rpm
