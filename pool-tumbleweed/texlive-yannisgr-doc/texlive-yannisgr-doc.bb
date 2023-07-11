SUMMARY = "Documentation for texlive-yannisgr"
DESCRIPTION = "This package includes the documentation for texlive-yannisgr"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn22613"

RPM_NAME = "texlive-yannisgr-doc-2023.201.svn22613-52.2.noarch.rpm"
RPM_HASH = "0ad1fe751459b1c58a21676867b038db112ed16c863cad769dc62d4466685d78f5c746730fe553b8e444095c17d34988177d19151a2dfbf4b890c505c52a0a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yannisgr-doc"

RDEPENDS:${PN} += ""

inherit rpm
