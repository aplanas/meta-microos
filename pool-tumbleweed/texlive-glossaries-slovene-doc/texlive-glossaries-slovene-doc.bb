SUMMARY = "Documentation for texlive-glossaries-slovene"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-slovene"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51211"

RPM_NAME = "texlive-glossaries-slovene-doc-2023.209.1.0svn51211-54.2.noarch.rpm"
RPM_HASH = "5ca83dbabeb5b0bf0a84f47f2b5e6cbd67ddb3caf3aa9d29e312a91b5cc4a3d88e0ad0f9fcd9040f4030345d093f01ab5ad5b4689b0eeaeb133c0c311b41e2f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-slovene-doc"

RDEPENDS:${PN} += ""

inherit rpm
