SUMMARY = "Documentation for texlive-xetex-devanagari"
DESCRIPTION = "This package includes the documentation for texlive-xetex-devanagari"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn34296"

RPM_NAME = "texlive-xetex-devanagari-doc-2023.209.0.0.5svn34296-53.1.noarch.rpm"
RPM_HASH = "fba8bc5587430692134f2777de99ea80e06e0e0d1d9d69bcf8a9908233ea17976a0c1532df287a4ea4a2ad8500a9a9f8ca5664a46da013d00a7e82cfa5767ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-devanagari-doc"

RDEPENDS:${PN} += ""

inherit rpm
