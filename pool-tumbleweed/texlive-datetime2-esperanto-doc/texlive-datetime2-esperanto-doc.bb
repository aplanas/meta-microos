SUMMARY = "Documentation for texlive-datetime2-esperanto"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-esperanto"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47356"

RPM_NAME = "texlive-datetime2-esperanto-doc-2023.209.1.1svn47356-53.1.noarch.rpm"
RPM_HASH = "6da9b8e044a7e1a68660c04f3990a0d88d4be9ca8c97258e8ebc29a3cf7f0a349e9299d10acc274c5e8eb146ce36561ef1820497d5c4bb2f3b2c2dc4ce84285e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-esperanto-doc"

RDEPENDS:${PN} += ""

inherit rpm
