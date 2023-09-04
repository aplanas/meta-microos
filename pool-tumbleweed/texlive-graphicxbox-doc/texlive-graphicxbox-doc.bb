SUMMARY = "Documentation for texlive-graphicxbox"
DESCRIPTION = "This package includes the documentation for texlive-graphicxbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn32630"

RPM_NAME = "texlive-graphicxbox-doc-2023.209.1.0svn32630-54.2.noarch.rpm"
RPM_HASH = "b0e98bfd16cd4a4c0faa61dbd3de4bcb39943177e2c62252316a1b9aff4a38a018e202332864d654d840154e4d1892b6244f410639e3f58a8d47286b8b39e404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicxbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
