SUMMARY = "Documentation for texlive-pxjahyper"
DESCRIPTION = "This package includes the documentation for texlive-pxjahyper"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn66272"

RPM_NAME = "texlive-pxjahyper-doc-2023.209.1.3svn66272-54.2.noarch.rpm"
RPM_HASH = "50e48e054e26d723f689508c1f05741eba111abb406a13475799b589cbc669701b815414c3c6c7f02f8b661e0fa50c6d7b12d7360993ffe4aba8d569272719d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxjahyper-doc-ja \
texlive-pxjahyper-doc"

RDEPENDS:${PN} += ""

inherit rpm
