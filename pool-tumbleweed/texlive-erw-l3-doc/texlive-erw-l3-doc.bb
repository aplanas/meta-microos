SUMMARY = "Documentation for texlive-erw-l3"
DESCRIPTION = "This package includes the documentation for texlive-erw-l3"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn61799"

RPM_NAME = "texlive-erw-l3-doc-2023.201.4.2svn61799-53.2.noarch.rpm"
RPM_HASH = "505775a3e8f0029e43d506fc21fd404e770498f3c872877a9752c14dc3e6863c13890596a0cf9d0161f812e11e7ffa0d04f659273ef19b9134e45b2ae6b224c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erw-l3-doc"

RDEPENDS:${PN} += ""

inherit rpm
