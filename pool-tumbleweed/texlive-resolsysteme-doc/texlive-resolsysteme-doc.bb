SUMMARY = "Documentation for texlive-resolsysteme"
DESCRIPTION = "This package includes the documentation for texlive-resolsysteme"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.5svn66192"

RPM_NAME = "texlive-resolsysteme-doc-2023.209.0.0.1.5svn66192-54.1.noarch.rpm"
RPM_HASH = "de5676b402b37db2ff756b0c9bc301cfafae9f9338d15029f77e4aee4e0b66001ebf96bace241c394ee2138ef6c6ee3c990357a632288f63e12b795e22f51c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-resolsysteme-doc-fr \
texlive-resolsysteme-doc"

RDEPENDS:${PN} += ""

inherit rpm
