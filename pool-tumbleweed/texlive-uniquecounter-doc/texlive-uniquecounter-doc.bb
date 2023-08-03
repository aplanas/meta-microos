SUMMARY = "Documentation for texlive-uniquecounter"
DESCRIPTION = "This package includes the documentation for texlive-uniquecounter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn53162"

RPM_NAME = "texlive-uniquecounter-doc-2023.209.1.4svn53162-54.1.noarch.rpm"
RPM_HASH = "5de7a3c9d88c4471a4543db65bf8a6283c1b0bc10fcee2415b4c25a8d6a7319377afaf618b8f0ee71dc3626707ea00a4d7dcf124febef101e5fd2764f9279e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uniquecounter-doc"

RDEPENDS:${PN} += ""

inherit rpm
