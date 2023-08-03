SUMMARY = "Documentation for texlive-datetime2-icelandic"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-icelandic"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn65213"

RPM_NAME = "texlive-datetime2-icelandic-doc-2023.209.1.2svn65213-53.1.noarch.rpm"
RPM_HASH = "0b26656ddcd993d78cfb5e999761bedfdda68e2bdbd95faa52fa0ae6b3845e9913c886a7cf01d6cc7de90abd5bdb8b58c8ca90a7243853e142b9efcd052ca3ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-icelandic-doc"

RDEPENDS:${PN} += ""

inherit rpm
