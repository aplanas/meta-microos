SUMMARY = "Documentation for texlive-romanbar"
DESCRIPTION = "This package includes the documentation for texlive-romanbar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0fsvn25005"

RPM_NAME = "texlive-romanbar-doc-2023.201.1.0fsvn25005-53.1.noarch.rpm"
RPM_HASH = "c761c48a8274050f04cdcdd30e7451062fdfcc8632dc664971ffb47b8d3492988fe178ce7e1bde108c9f3c6e6ee9dcfafa3f8b0e1a901abdb8fa0bf1c3ebab95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romanbar-doc"
RDEPENDS:${PN} += ""

inherit rpm
