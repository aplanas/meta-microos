SUMMARY = "Documentation for texlive-xdoc"
DESCRIPTION = "This package includes the documentation for texlive-xdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.prot2.5svn15878"

RPM_NAME = "texlive-xdoc-doc-2023.201.prot2.5svn15878-52.1.noarch.rpm"
RPM_HASH = "42b8f10db66903c77df0ef7cf5dacbbf2db2419c0ecb324faa6338e75fa930279a5f8d11919d712effb2a6118299c7fd738fa04a5293067cd36bbc85d96ecb6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xdoc-doc"
RDEPENDS:${PN} += ""

inherit rpm
