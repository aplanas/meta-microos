SUMMARY = "Documentation for texlive-newcomputermodern"
DESCRIPTION = "This package includes the documentation for texlive-newcomputermodern"
LICENSE = "LPPL-1.3c"

PV = "2023.209.4.4svn66327"

RPM_NAME = "texlive-newcomputermodern-doc-2023.209.4.4svn66327-55.1.noarch.rpm"
RPM_HASH = "df55306735e2f36194e7ed85ab492ab1d7d03449649715d02b6b86a47bb4e2cead20869b9bf8878704d6bfb3da612f9c959bb829daef921f34ae589df093db2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newcomputermodern-doc"

RDEPENDS:${PN} += ""

inherit rpm
