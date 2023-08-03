SUMMARY = "Documentation for texlive-comicneue"
DESCRIPTION = "This package includes the documentation for texlive-comicneue"
LICENSE = "OFL-1.1"

PV = "2023.209.1.2svn54891"

RPM_NAME = "texlive-comicneue-doc-2023.209.1.2svn54891-54.1.noarch.rpm"
RPM_HASH = "a61d069a8886bcf21039414bfc0f507b398c34dd6b624cf69058edc46c4e2b94a4747419321d53249d772177c1d63dd1cacecabd20500198283ded4e60819727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comicneue-doc"

RDEPENDS:${PN} += ""

inherit rpm
