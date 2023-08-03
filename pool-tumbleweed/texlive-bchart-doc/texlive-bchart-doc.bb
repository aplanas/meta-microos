SUMMARY = "Documentation for texlive-bchart"
DESCRIPTION = "This package includes the documentation for texlive-bchart"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.3svn43928"

RPM_NAME = "texlive-bchart-doc-2023.209.0.0.1.3svn43928-54.1.noarch.rpm"
RPM_HASH = "270ac541c21c79e7bd1dbea03f68e46af6097fab773e2c5429c6252215f6a9e39d4762562976fb51afd6932fbed5fb56202708bff22f1abed848aaa7a8bb5df0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bchart-doc"

RDEPENDS:${PN} += ""

inherit rpm
