SUMMARY = "Documentation for texlive-jigsaw"
DESCRIPTION = "This package includes the documentation for texlive-jigsaw"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn66009"

RPM_NAME = "texlive-jigsaw-doc-2023.209.0.0.4svn66009-56.1.noarch.rpm"
RPM_HASH = "aa6c1dd252d5f480e957edee132197a62ea49eee53b7f5d9ca192355238e256c6746dda22c4db71b5feeb236ee8d7572b3f6e67b0873435a065afc04f08dcdf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jigsaw-doc"

RDEPENDS:${PN} += ""

inherit rpm
