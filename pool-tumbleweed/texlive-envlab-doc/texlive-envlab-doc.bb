SUMMARY = "Documentation for texlive-envlab"
DESCRIPTION = "This package includes the documentation for texlive-envlab"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61937"

RPM_NAME = "texlive-envlab-doc-2023.201.1.2svn61937-53.2.noarch.rpm"
RPM_HASH = "f63947d0a538d71d37e468e9c72ef2c07f99c3b61d3b2280efa4d258a6feaa73baab9fc7c528aac6fb271f71e1d68cefad63923753b8491d6d091d0f98d364bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-envlab-doc"

RDEPENDS:${PN} += ""

inherit rpm
