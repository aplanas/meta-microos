SUMMARY = "Documentation for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains documentation for gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-doc-2023-1.2.noarch.rpm"
RPM_HASH = "4451f1c2681372622f6d5b319987360824be0d18e582af1d382f89c3af2e4902b6e4ec47187465a910a4582f0618d9400f92d676716566862ca9b575af1c303e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gromacs-doc"

RDEPENDS:${PN} += ""

inherit rpm
