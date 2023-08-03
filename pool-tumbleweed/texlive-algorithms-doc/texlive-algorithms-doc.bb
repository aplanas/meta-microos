SUMMARY = "Documentation for texlive-algorithms"
DESCRIPTION = "This package includes the documentation for texlive-algorithms"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.0.0.1svn42428"

RPM_NAME = "texlive-algorithms-doc-2023.209.0.0.1svn42428-55.1.noarch.rpm"
RPM_HASH = "ebbf117d8a4f4b5c472f741674760cd30ff13ceae694cbeec2bcdf2369f5731be05bf24348a7e7e429592b427480f9bc53fe95ca7c72163e02f7530b0c89a435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-algorithms-doc-en \
texlive-algorithms-doc"

RDEPENDS:${PN} += ""

inherit rpm
