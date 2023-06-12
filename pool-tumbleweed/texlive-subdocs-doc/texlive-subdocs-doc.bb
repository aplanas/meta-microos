SUMMARY = "Documentation for texlive-subdocs"
DESCRIPTION = "This package includes the documentation for texlive-subdocs"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn51480"

RPM_NAME = "texlive-subdocs-doc-2023.201.0.0.1svn51480-57.1.noarch.rpm"
RPM_HASH = "8d97c08b6e4d8ea7cdc1afa70a8afc3e422f5de3b3dc06a42ab276768ab1f242666a78a448738633f05f63c41bcb9052fd7582960992ca988275704b314d6c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subdocs-doc"
RDEPENDS:${PN} += ""

inherit rpm
