SUMMARY = "Documentation for texlive-incgraph"
DESCRIPTION = "This package includes the documentation for texlive-incgraph"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn60810"

RPM_NAME = "texlive-incgraph-doc-2023.209.1.2.0svn60810-54.1.noarch.rpm"
RPM_HASH = "9eaeb18a033bff95c48f3b93609a1a6e0f47aaee5727671e1b4f65c2b2cc2cb1cad3b64f54edfc580e95b668b661c2c409b2e150ad0927a8211f4b3a36aa20c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-incgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
