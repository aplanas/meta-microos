SUMMARY = "Documentation for Garlic, a molecular graphics visualization tool"
DESCRIPTION = "Garlic is an X Window System tool intended for the molecular \
visualization of protein structure, DNA structure, and biological \
macromolecules. \
This subpackage contains the full documentation to Garlic."
LICENSE = "LGPL-2.1+"

PV = "1.6"

RPM_NAME = "garlic-doc-1.6-221.21.noarch.rpm"
RPM_HASH = "6dd5073ac96f7501cb3d2717467b56043f5cfea50790bdb41ef30bdf785357d5bf9b5de67ee0e1ba4da9630e4ded23beb264a247d26816334bfdf86f02c0a222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "garlic-doc"

RDEPENDS:${PN} += ""

inherit rpm
