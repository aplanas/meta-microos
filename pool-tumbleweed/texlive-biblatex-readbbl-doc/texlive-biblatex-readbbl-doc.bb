SUMMARY = "Documentation for texlive-biblatex-readbbl"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-readbbl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn61549"

RPM_NAME = "texlive-biblatex-readbbl-doc-2023.209.0.0.01svn61549-54.1.noarch.rpm"
RPM_HASH = "45887fb7ac7c67a7256d2f4758e6b4f45abe1c901b70d3a9340e0e53af8dffe98783c2020a8ee975ee31bd6e594b644da7af0b6a00b82568d99660136721bdf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-readbbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
