SUMMARY = "Documentation for texlive-nomentbl"
DESCRIPTION = "This package includes the documentation for texlive-nomentbl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn16549"

RPM_NAME = "texlive-nomentbl-doc-2023.209.0.0.4svn16549-55.1.noarch.rpm"
RPM_HASH = "0e5f8ebd5e19991a1579ae046b440f8dc61ca0bfab665aaa4e3e6051c2261f248a25a5fe0a0c2f2284741447e48afcb8feda438f227ea6f79ccd924ad0f8d31f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nomentbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
