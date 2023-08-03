SUMMARY = "Documentation for texlive-autoaligne"
DESCRIPTION = "This package includes the documentation for texlive-autoaligne"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn56966"

RPM_NAME = "texlive-autoaligne-doc-2023.209.1.5svn56966-54.1.noarch.rpm"
RPM_HASH = "93a03ef2a708255274f65c8554bfde2321f2608bf89d5813ab9bcf33882e04961f68dda3cb5fbe8eac420c2e173cf1aebcb6ebf222cc6305a263b5db5f8d0106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-autoaligne-doc-fr \
texlive-autoaligne-doc"

RDEPENDS:${PN} += ""

inherit rpm
