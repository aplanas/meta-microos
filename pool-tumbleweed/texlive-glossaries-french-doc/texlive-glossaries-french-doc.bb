SUMMARY = "Documentation for texlive-glossaries-french"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-french"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42873"

RPM_NAME = "texlive-glossaries-french-doc-2023.209.1.1svn42873-54.2.noarch.rpm"
RPM_HASH = "ab285872324a9e0d5ee130069d91c879c7069dd88268d13533b5a16561ac495141e04b71a7d322f860c6ab2afcf673fe662c18c5969fc0ca37e1bdcfc9fbfd67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
