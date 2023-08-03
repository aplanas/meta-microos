SUMMARY = "Documentation for texlive-latex2nemeth"
DESCRIPTION = "This package includes the documentation for texlive-latex2nemeth"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1.3svn65269"

RPM_NAME = "texlive-latex2nemeth-doc-2023.209.1.1.3svn65269-55.1.noarch.rpm"
RPM_HASH = "a419981d3ea6875a1c85f503d3a69783638d4ea8c42b60dfa9573544200391c58a2834a3af6ecb5f48b79722b390ae76063fc91e9fb4557322e8de1226857824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2nemeth-doc"

RDEPENDS:${PN} += ""

inherit rpm
