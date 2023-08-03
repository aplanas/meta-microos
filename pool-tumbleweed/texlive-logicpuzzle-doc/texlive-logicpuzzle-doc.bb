SUMMARY = "Documentation for texlive-logicpuzzle"
DESCRIPTION = "This package includes the documentation for texlive-logicpuzzle"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5svn34491"

RPM_NAME = "texlive-logicpuzzle-doc-2023.209.2.5svn34491-55.1.noarch.rpm"
RPM_HASH = "6274c1ca5974c8507bab50394c413859b7b81ce5e9ec9ba675fb1553bdff58d201893b95449b6236aa8cdc86cce87f1361013e22fd8d9098e3b6d00586b190bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logicpuzzle-doc"

RDEPENDS:${PN} += ""

inherit rpm
