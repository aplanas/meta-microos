SUMMARY = "Documentation for texlive-suftesi"
DESCRIPTION = "This package includes the documentation for texlive-suftesi"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.0svn60991"

RPM_NAME = "texlive-suftesi-doc-2023.209.3.2.0svn60991-58.1.noarch.rpm"
RPM_HASH = "8da5ccba0cf52876b29ece213915f1d90d5832d88c28f5f21d4ad2e0400615e7fb538e3672b0e770d0db2af23d84db1668ba4ea165b790d9f9bcbd97fd705b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-suftesi-doc-en \
texlive-suftesi-doc"

RDEPENDS:${PN} += ""

inherit rpm
