SUMMARY = "Documentation for texlive-mathfont"
DESCRIPTION = "This package includes the documentation for texlive-mathfont"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2asvn65205"

RPM_NAME = "texlive-mathfont-doc-2023.201.2.2asvn65205-52.1.noarch.rpm"
RPM_HASH = "3651132c7e48733b0c48b18575f009ab487c56a06c28938299f6fa48ac5bfd7c3a14a9e417e972c88eeca5b7cdcf6f7d55fdfba821ca209e9cc0d643c25f46fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
