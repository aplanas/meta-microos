SUMMARY = "Documentation for texlive-bubblesort"
DESCRIPTION = "This package includes the documentation for texlive-bubblesort"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56070"

RPM_NAME = "texlive-bubblesort-doc-2023.209.1.0svn56070-53.1.noarch.rpm"
RPM_HASH = "1b244840c74d9f67378390d1f3f7b53f97896fc7a046df660dcd159a006177425f48a8cf06921182ea1f1daea0e8aaa1f7e5ba4d35176906f7776ef4e7252638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bubblesort-doc"

RDEPENDS:${PN} += ""

inherit rpm
