SUMMARY = "Documentation for texlive-ydoc"
DESCRIPTION = "This package includes the documentation for texlive-ydoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7alphasvn64887"

RPM_NAME = "texlive-ydoc-doc-2023.209.0.0.7alphasvn64887-53.2.noarch.rpm"
RPM_HASH = "098a15ebf3b806c168798725d86bf6ea855c7a6263b43d0fe1654a202f65b89471ae522d762ae7f1818f4bbb47420e2819852d7b78f82add2544bf378320c57a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ydoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
