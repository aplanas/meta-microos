SUMMARY = "Documentation for texlive-notes2bib"
DESCRIPTION = "This package includes the documentation for texlive-notes2bib"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0msvn52231"

RPM_NAME = "texlive-notes2bib-doc-2023.209.2.0msvn52231-55.1.noarch.rpm"
RPM_HASH = "397b652bf0152a7d977640bb730bf6d8726f8f959b9053e0cec18651daf051704cf508d5507051ccfb106ebe84e2a92c7c7e31ac3da4c35ef05053139bb3d211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notes2bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
