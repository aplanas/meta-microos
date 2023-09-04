SUMMARY = "Documentation for texlive-elocalloc"
DESCRIPTION = "This package includes the documentation for texlive-elocalloc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn42712"

RPM_NAME = "texlive-elocalloc-doc-2023.209.0.0.03svn42712-54.2.noarch.rpm"
RPM_HASH = "32a18171fc5bb7686fb89c62a20568418c2fe5632dbae47c539e751b5ab257a5afec861428da4c4d3b620d918b543f6552f45f25c729bd8662536c4dc2420be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elocalloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
