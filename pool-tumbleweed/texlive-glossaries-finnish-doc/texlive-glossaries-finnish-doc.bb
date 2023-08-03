SUMMARY = "Documentation for texlive-glossaries-finnish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-finnish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-glossaries-finnish-doc-2023.209.1.0svn54080-54.1.noarch.rpm"
RPM_HASH = "d499885101f3f1302ac2b6caefbdf8e9f24cd48c673752fdc4a41b199e057d00c540f5572ea09343a8c8675b53f8e3829a9cc07eeb947e9b3905873c972866e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-finnish-doc"

RDEPENDS:${PN} += ""

inherit rpm
