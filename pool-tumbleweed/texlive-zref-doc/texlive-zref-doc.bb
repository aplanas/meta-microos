SUMMARY = "Documentation for texlive-zref"
DESCRIPTION = "This package includes the documentation for texlive-zref"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.34svn62977"

RPM_NAME = "texlive-zref-doc-2023.201.2.34svn62977-52.1.noarch.rpm"
RPM_HASH = "b31b9b63208181a3903d02c0e8075ba3c8f67b32f07f7fe9ca559debdc91fa8ab4c0c8d7c31249a1536bd3bbb58176168e3713d90d81f764d545749c7e7cb477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-doc"
RDEPENDS:${PN} += ""

inherit rpm
