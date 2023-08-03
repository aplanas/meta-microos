SUMMARY = "Documentation for texlive-pst-perspective"
DESCRIPTION = "This package includes the documentation for texlive-pst-perspective"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn39585"

RPM_NAME = "texlive-pst-perspective-doc-2023.209.1.05svn39585-54.1.noarch.rpm"
RPM_HASH = "fe896a898669d16f5e746c7b8f9ff93169f6d6b241a33e81be692981ea8aad45bb216dad8eac067aa4980433d063a720d007797bbb868a76e845d24777e77507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-perspective-doc-de;en \
texlive-pst-perspective-doc"

RDEPENDS:${PN} += ""

inherit rpm
