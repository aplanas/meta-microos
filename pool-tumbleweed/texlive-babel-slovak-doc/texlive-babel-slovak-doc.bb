SUMMARY = "Documentation for texlive-babel-slovak"
DESCRIPTION = "This package includes the documentation for texlive-babel-slovak"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1asvn30292"

RPM_NAME = "texlive-babel-slovak-doc-2023.209.3.1asvn30292-54.1.noarch.rpm"
RPM_HASH = "d919bc3404330f8d4b79dc9382f8b719f946db955626b855518d11acb99001b4ee048064577cc186f4c7738e70ba24063d9ccb27b23917d00f1fc68b950bfcca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-slovak-doc"

RDEPENDS:${PN} += ""

inherit rpm
