SUMMARY = "Documentation for texlive-xkeyval"
DESCRIPTION = "This package includes the documentation for texlive-xkeyval"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.9svn63616"

RPM_NAME = "texlive-xkeyval-doc-2023.209.2.9svn63616-53.2.noarch.rpm"
RPM_HASH = "82ed2d73e5ac037d56849e555633efdbaab48175b6481cefae637ed494ae1bedb5a289852647b86a88f983d06353a80a764763c35d917355ff82359ba4c2ffbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xkeyval-doc"

RDEPENDS:${PN} += ""

inherit rpm
