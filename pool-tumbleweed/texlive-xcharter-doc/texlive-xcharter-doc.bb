SUMMARY = "Documentation for texlive-xcharter"
DESCRIPTION = "This package includes the documentation for texlive-xcharter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.24svn63057"

RPM_NAME = "texlive-xcharter-doc-2023.201.1.24svn63057-52.1.noarch.rpm"
RPM_HASH = "0c2fdbe057a9661ec3d98904aff999cb1a8d2b37819e445bd23c687edbc6e774eb1bc94cf289ea91a0a895e97266d90dcfae9a123e1cfdf752e8a30be1e6adc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcharter-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
