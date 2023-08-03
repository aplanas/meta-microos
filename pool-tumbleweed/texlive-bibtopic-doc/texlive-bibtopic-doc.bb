SUMMARY = "Documentation for texlive-bibtopic"
DESCRIPTION = "This package includes the documentation for texlive-bibtopic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-bibtopic-doc-2023.209.1.1asvn15878-54.1.noarch.rpm"
RPM_HASH = "2ee03001eead43993a5d6e1f65c1fd18988c36333263a86a999f98a6cbf8f6b400b339b207f8a1e013427ac8b65b673163259f6294c3ce13298f46aca925c9dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibtopic-doc"

RDEPENDS:${PN} += ""

inherit rpm
