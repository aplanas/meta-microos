SUMMARY = "Documentation for texlive-nopageno"
DESCRIPTION = "This package includes the documentation for texlive-nopageno"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18128"

RPM_NAME = "texlive-nopageno-doc-2023.201.svn18128-54.1.noarch.rpm"
RPM_HASH = "412b53c9d1421911378a1b1dd30534c932f3a9a01de47f35a1184c855a83a4672f1a4d36ad1867261f92c63e45de6befa54fde6ab2707d4597c1c3ea32f7a861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nopageno-doc"

RDEPENDS:${PN} += ""

inherit rpm
