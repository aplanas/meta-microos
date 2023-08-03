SUMMARY = "Documentation for texlive-babel-scottish"
DESCRIPTION = "This package includes the documentation for texlive-babel-scottish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0gsvn30289"

RPM_NAME = "texlive-babel-scottish-doc-2023.209.1.0gsvn30289-54.1.noarch.rpm"
RPM_HASH = "b91b38dc9570462e29c548ad575bc60d4dc819b6b94d2c2570a3778c6a29822d5550df9a9f67ff8abfaa278b81e6a4256aaf325095af3e842f09c357d7fee09f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-scottish-doc"

RDEPENDS:${PN} += ""

inherit rpm
