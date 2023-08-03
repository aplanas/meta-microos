SUMMARY = "Documentation for texlive-scrlayer-fancyhdr"
DESCRIPTION = "This package includes the documentation for texlive-scrlayer-fancyhdr"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.2svn63844"

RPM_NAME = "texlive-scrlayer-fancyhdr-doc-2023.209.0.0.2.2svn63844-54.1.noarch.rpm"
RPM_HASH = "2187dd11f1b40c1b34db9a68cb341bca079822b9c5b0ea5378ae506932f42ccb1f369a690b44082cfe75641e7bbea96a30a9a83d8360ea6bdc980863a2d0a332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrlayer-fancyhdr-doc"

RDEPENDS:${PN} += ""

inherit rpm
