SUMMARY = "Documentation for texlive-everyhook"
DESCRIPTION = "This package includes the documentation for texlive-everyhook"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn35675"

RPM_NAME = "texlive-everyhook-doc-2023.209.1.2svn35675-53.1.noarch.rpm"
RPM_HASH = "f242b2e7ad114eb45d4e54206729feac1527515d2ca5ba0757cc031b22f0787f2d365309abf0a5529abb1920cc66054166fec050a0aabca98ce45937d9950599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everyhook-doc"

RDEPENDS:${PN} += ""

inherit rpm
