SUMMARY = "Documentation for texlive-hardwrap"
DESCRIPTION = "This package includes the documentation for texlive-hardwrap"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn21396"

RPM_NAME = "texlive-hardwrap-doc-2023.201.0.0.2svn21396-53.2.noarch.rpm"
RPM_HASH = "6d0b926faa5f7bb59c4ee2153e294fe5b07bd417d1855efb63ec634ca0aa77fe258c81fba0ee1ef1ddede8720aa2b87c5f6f7495e14354603bf3ed63c82f53d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hardwrap-doc"

RDEPENDS:${PN} += ""

inherit rpm
