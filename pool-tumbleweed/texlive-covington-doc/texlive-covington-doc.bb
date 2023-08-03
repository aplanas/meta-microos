SUMMARY = "Documentation for texlive-covington"
DESCRIPTION = "This package includes the documentation for texlive-covington"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.8svn64241"

RPM_NAME = "texlive-covington-doc-2023.209.2.8svn64241-55.1.noarch.rpm"
RPM_HASH = "999b26155ad7789967a63613482fd586770fe342336db2906734396950dc57619d2d6f333c56268a3b605ad91d78927a041bd3ae2e0008f0699f0272279347d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-covington-doc"

RDEPENDS:${PN} += ""

inherit rpm
