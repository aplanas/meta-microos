SUMMARY = "Documentation for texlive-withargs"
DESCRIPTION = "This package includes the documentation for texlive-withargs"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.1svn52641"

RPM_NAME = "texlive-withargs-doc-2023.209.0.0.3.1svn52641-54.1.noarch.rpm"
RPM_HASH = "1c07195cb5686d3130fda6bf9bbad108b43c7cab44cb7b1831c508b8b2847787616ca2ee0e6c4c8ebc4ce3011fdf9f08a4b61ba15732d856d1ec4401227e3dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-withargs-doc"

RDEPENDS:${PN} += ""

inherit rpm
