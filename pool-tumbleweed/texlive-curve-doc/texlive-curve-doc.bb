SUMMARY = "Documentation for texlive-curve"
DESCRIPTION = "This package includes the documentation for texlive-curve"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.16svn20745"

RPM_NAME = "texlive-curve-doc-2023.209.1.16svn20745-55.1.noarch.rpm"
RPM_HASH = "050ad10ecdbeaa00b934fbbabfd38313939594697c056fe0c5173a7500dff95ab270910aae299e0cb2cb35ad43727d35158898f87f3ec915abc2474362b9c89d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-curve-doc"

RDEPENDS:${PN} += ""

inherit rpm
