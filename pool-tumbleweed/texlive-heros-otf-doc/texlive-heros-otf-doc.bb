SUMMARY = "Documentation for texlive-heros-otf"
DESCRIPTION = "This package includes the documentation for texlive-heros-otf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn64695"

RPM_NAME = "texlive-heros-otf-doc-2023.201.0.0.01svn64695-53.2.noarch.rpm"
RPM_HASH = "1e1f1882b84b64e7d3aa037877b9fc14424602a102756403eb2fc2eb108f9fb9195a3bbb039d1e3d82eeb1473ee18fe6675cd7d7c7b82c95e1d0353719a88606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-heros-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
