SUMMARY = "Documentation for texlive-rtklage"
DESCRIPTION = "This package includes the documentation for texlive-rtklage"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-rtklage-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "e917550c873b2386a7eb25a9cefac99e65625e2e748af2de6cee38946a8b0f4496530f1c957315535c79a9c621427c6a4c29b7121a7e16eb68417c189363891a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-rtklage-doc-de \
texlive-rtklage-doc"

RDEPENDS:${PN} += ""

inherit rpm
