SUMMARY = "Documentation for texlive-grafcet"
DESCRIPTION = "This package includes the documentation for texlive-grafcet"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.5svn22509"

RPM_NAME = "texlive-grafcet-doc-2023.209.1.3.5svn22509-54.2.noarch.rpm"
RPM_HASH = "bcc9bc7cf58379af8ec932f6cd92a84c0901a82764f27890d382d950e332310e2f87a1f02dbca75969a8b006b59c6c39f9eb86d936bc77f63e48ca9ed89569ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-grafcet-doc-fr \
texlive-grafcet-doc"

RDEPENDS:${PN} += ""

inherit rpm
