SUMMARY = "Documentation for texlive-tikz-bagua"
DESCRIPTION = "This package includes the documentation for texlive-tikz-bagua"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn64103"

RPM_NAME = "texlive-tikz-bagua-doc-2023.201.1.01svn64103-54.1.noarch.rpm"
RPM_HASH = "b1dfed1c2e621eab43bff8a8d98de7968f10455c3537637568b567c9886fe14c08682164bc5110413f412411bc3e5e0207692c4605c2aba50f6a5a000b882049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tikz-bagua-doc:zh) \
texlive-tikz-bagua-doc"

RDEPENDS:${PN} += ""

inherit rpm
