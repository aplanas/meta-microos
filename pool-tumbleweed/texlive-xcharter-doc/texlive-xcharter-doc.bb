SUMMARY = "Documentation for texlive-xcharter"
DESCRIPTION = "This package includes the documentation for texlive-xcharter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.24svn63057"

RPM_NAME = "texlive-xcharter-doc-2023.209.1.24svn63057-53.2.noarch.rpm"
RPM_HASH = "db1618681cc2b1005f2c7743b5f0a7b507137424b299f3ceaa4c8f679b6a055e4a077d6a9040b41d9f27b61922f727e1d8605ae2470397099fca16c625fa2397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcharter-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
