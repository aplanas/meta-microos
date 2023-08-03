SUMMARY = "Documentation for texlive-multicolrule"
DESCRIPTION = "This package includes the documentation for texlive-multicolrule"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn56366"

RPM_NAME = "texlive-multicolrule-doc-2023.209.1.3asvn56366-55.1.noarch.rpm"
RPM_HASH = "e90a75f9afdf31b4822638ac0d20705d651e5d4a062a24aebee07e16cfbafa8d6f2056e5b94fcb336fa335f522eb699064fca911790c1b78af7be09935be2b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multicolrule-doc"

RDEPENDS:${PN} += ""

inherit rpm
