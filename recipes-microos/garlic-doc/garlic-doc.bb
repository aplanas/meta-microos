SUMMARY = "Documentation for Garlic, a molecular graphics visualization tool"
DESCRIPTION = "Garlic is an X Window System tool intended for the molecular \
visualization of protein structure, DNA structure, and biological \
macromolecules. \
This subpackage contains the full documentation to Garlic."
LICENSE = "LGPL-2.1+"

PV = "1.6"

RPM_NAME = "garlic-doc-1.6-221.20.noarch.rpm"
RPM_HASH = "cd1100d68b317568675fbf733a2e5945b7bd872919195b9abb56d234800f15ee462dcfd28074e113bcee9805bcdf2fdd1d719aca066c7cd630b6e5bacfc03bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "garlic-doc"
RDEPENDS:${PN} += ""

inherit rpm
