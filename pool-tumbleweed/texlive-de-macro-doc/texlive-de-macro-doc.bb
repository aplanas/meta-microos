SUMMARY = "Documentation for texlive-de-macro"
DESCRIPTION = "This package includes the documentation for texlive-de-macro"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.1svn61719"

RPM_NAME = "texlive-de-macro-doc-2023.209.1.4.1svn61719-53.1.noarch.rpm"
RPM_HASH = "1cc4cce464254bed97485b961ba9ad9f369fde5f4f77b2252161b2e492a1d46db75a16cdaf1f826003df49378c4be3404f603e77d692bfd7553ac14dbc7eb270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-de-macro-doc"

RDEPENDS:${PN} += ""

inherit rpm
