SUMMARY = "Documentation for texlive-circ"
DESCRIPTION = "This package includes the documentation for texlive-circ"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn62977"

RPM_NAME = "texlive-circ-doc-2023.209.1.1svn62977-54.1.noarch.rpm"
RPM_HASH = "6af7dacfc2fec12dd102d8d547363c378caa4d0e2e817948ecefbc60403551797f315e7726a0e6fd0ebf68df88ce2e796721b505cd6ea8dce6a58c5ce9c0564c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circ-doc"

RDEPENDS:${PN} += ""

inherit rpm
