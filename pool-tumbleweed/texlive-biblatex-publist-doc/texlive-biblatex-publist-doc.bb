SUMMARY = "Documentation for texlive-biblatex-publist"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-publist"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn66273"

RPM_NAME = "texlive-biblatex-publist-doc-2023.201.2.2svn66273-53.1.noarch.rpm"
RPM_HASH = "68c356fd1e40eacc0dd62fa0eb2741bb049bdb0d592b4617aeaee046fe6597eebe5afd2bf4fc0c4e8d5295446627bb4210e1e9f0be6d56e6607b5eab00d97e33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-publist-doc"
RDEPENDS:${PN} += ""

inherit rpm
