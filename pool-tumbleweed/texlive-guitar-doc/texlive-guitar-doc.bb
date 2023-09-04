SUMMARY = "Documentation for texlive-guitar"
DESCRIPTION = "This package includes the documentation for texlive-guitar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn32258"

RPM_NAME = "texlive-guitar-doc-2023.209.1.6svn32258-54.2.noarch.rpm"
RPM_HASH = "67ce4f3246d57133be92f80fed530c0539c1801c175e51d4fdbce11195547ca58562cb1ac96990a2130da8d947102b83f5234e101e2f250de563fb09ffedb9bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guitar-doc"

RDEPENDS:${PN} += ""

inherit rpm
