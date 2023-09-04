SUMMARY = "Documentation for texlive-greekdates"
DESCRIPTION = "This package includes the documentation for texlive-greekdates"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-greekdates-doc-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "b3ddc2bdb4fa9e2e5cd75ec191f7bb753196aca07864be970e62a8f8edc39149c27844cb7c75d32b2f53f42268131f63a4431244f1579946ad6f7258a0c42b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greekdates-doc"

RDEPENDS:${PN} += ""

inherit rpm
