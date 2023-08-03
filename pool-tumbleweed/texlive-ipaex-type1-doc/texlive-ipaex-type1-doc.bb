SUMMARY = "Documentation for texlive-ipaex-type1"
DESCRIPTION = "This package includes the documentation for texlive-ipaex-type1"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn47700"

RPM_NAME = "texlive-ipaex-type1-doc-2023.209.0.0.5svn47700-56.1.noarch.rpm"
RPM_HASH = "ee57d3570070dacb50773c5410c08132d61cd7cde7477e3472c1320c6f1f8eb607e61834606f095e54df6e391bc39398e7a5c50301947ac86ea913176937010e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ipaex-type1-doc-ja;en \
texlive-ipaex-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
