SUMMARY = "Documentation for texlive-glossaries-irish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-irish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-irish-doc-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "f2ae418378ece7a743a75984ac8c050d428135eb0c137272c00d0809bf457e8c3f7e1bed7dcf2c5d3a37e602513639a280608c72b6bcaa32bb317dbff2e8437a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-irish-doc"

RDEPENDS:${PN} += ""

inherit rpm
