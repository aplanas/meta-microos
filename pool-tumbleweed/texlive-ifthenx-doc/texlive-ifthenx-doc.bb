SUMMARY = "Documentation for texlive-ifthenx"
DESCRIPTION = "This package includes the documentation for texlive-ifthenx"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1asvn25819"

RPM_NAME = "texlive-ifthenx-doc-2023.208.0.0.1asvn25819-53.1.noarch.rpm"
RPM_HASH = "0bd1b4c6deec9fa9eec56dc92356af27bdd7af01dada8153929dfa245d49040f0e3f2def35badbd44fb86fdd2d0b3088a50db9ce49555a05b9f4dea513fd8337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifthenx-doc"

RDEPENDS:${PN} += ""

inherit rpm
