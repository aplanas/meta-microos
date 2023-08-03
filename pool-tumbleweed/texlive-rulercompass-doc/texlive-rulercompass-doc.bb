SUMMARY = "Documentation for texlive-rulercompass"
DESCRIPTION = "This package includes the documentation for texlive-rulercompass"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn32392"

RPM_NAME = "texlive-rulercompass-doc-2023.209.1svn32392-54.1.noarch.rpm"
RPM_HASH = "02517278202d1b1c4fb90ad60bd1998ca6261ed356d04a0fb00925efb148271413275194ad1a8ef4990404f65c4abcbe74caad3b93753ec59e9b07a30f5b9e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rulercompass-doc"

RDEPENDS:${PN} += ""

inherit rpm
