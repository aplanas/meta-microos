SUMMARY = "Documentation for texlive-invoice2"
DESCRIPTION = "This package includes the documentation for texlive-invoice2"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn46364"

RPM_NAME = "texlive-invoice2-doc-2023.209.svn46364-54.1.noarch.rpm"
RPM_HASH = "a23ad8158b68a8493ba6d93a83a0ff60a0cbe1da7e835d74b8fc68a43944c1b3c13669994140f52712ae184544b4730988f48bf9826a8ea3444ba1260b30348e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice2-doc"

RDEPENDS:${PN} += ""

inherit rpm
