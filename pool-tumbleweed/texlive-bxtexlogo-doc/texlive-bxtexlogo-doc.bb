SUMMARY = "Documentation for texlive-bxtexlogo"
DESCRIPTION = "This package includes the documentation for texlive-bxtexlogo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn63231"

RPM_NAME = "texlive-bxtexlogo-doc-2023.209.0.0.6svn63231-53.1.noarch.rpm"
RPM_HASH = "d62cad3a35252ecc1eca629accbd10d492eda27b3b54944a37d7ba1bba762168a5ff5a26d9ed94f43b7265448941c90f0398c86ee5296c4e38feca91fca18dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxtexlogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
