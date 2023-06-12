SUMMARY = "Documentation for texlive-minorrevision"
DESCRIPTION = "This package includes the documentation for texlive-minorrevision"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn32165"

RPM_NAME = "texlive-minorrevision-doc-2023.201.1.1svn32165-54.1.noarch.rpm"
RPM_HASH = "8a03efbfdcec079268b91cface95e2f02380d737dc6bf3b0b2586a6674734177e1808555bb1e0a7cd4b5708911deefc901d8419c21d7fdaf65f4c8ab3e15ac8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minorrevision-doc"
RDEPENDS:${PN} += ""

inherit rpm
