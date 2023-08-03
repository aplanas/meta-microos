SUMMARY = "Documentation for texlive-uwmslide"
DESCRIPTION = "This package includes the documentation for texlive-uwmslide"
LICENSE = "Artistic-1.0"

PV = "2023.209.svn27354"

RPM_NAME = "texlive-uwmslide-doc-2023.209.svn27354-54.1.noarch.rpm"
RPM_HASH = "cc6836637a6960637dd80036e3ee02032477ff18a6802f52ab55d58d217fdf967dad0ed4fc3d86ebefb92eaec26e5ebf38023d5c9ffe8e8d4f0e2b70852ad4f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwmslide-doc"

RDEPENDS:${PN} += ""

inherit rpm
