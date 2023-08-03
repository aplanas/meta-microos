SUMMARY = "Documentation for texlive-sudokubundle"
DESCRIPTION = "This package includes the documentation for texlive-sudokubundle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn15878"

RPM_NAME = "texlive-sudokubundle-doc-2023.209.1.0asvn15878-58.1.noarch.rpm"
RPM_HASH = "73afdbcf496452a965bbc3481eb6ab4653f2077720674f441574c62dd72386bd119c6e8f09be88f3286635b514960eb990da4d152f846feab35a29e3129cb873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sudokubundle-doc"

RDEPENDS:${PN} += ""

inherit rpm
