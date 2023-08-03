SUMMARY = "Documentation for texlive-thumbs"
DESCRIPTION = "This package includes the documentation for texlive-thumbs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0qsvn33134"

RPM_NAME = "texlive-thumbs-doc-2023.209.1.0qsvn33134-55.1.noarch.rpm"
RPM_HASH = "2aa216998ef7824da9876bfd570913c7a141a7c67002d61767f6c51659463e52ede94ab6228413e05667b15f5b8da352b686f21a0853bfac0775ff3934ee6ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thumbs-doc"

RDEPENDS:${PN} += ""

inherit rpm
