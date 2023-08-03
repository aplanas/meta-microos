SUMMARY = "Documentation for texlive-background"
DESCRIPTION = "This package includes the documentation for texlive-background"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn42428"

RPM_NAME = "texlive-background-doc-2023.209.2.1svn42428-54.1.noarch.rpm"
RPM_HASH = "09c9767625a96add527dbaf726c8a69098e4de20262dfb9f552a4fa9a41dfd5cfdc8f0fd815a1082fc85b2658e8b9c4dd8aab3a5f27b420305c3681dc252f1dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-background-doc"

RDEPENDS:${PN} += ""

inherit rpm
