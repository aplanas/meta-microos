SUMMARY = "Documentation for texlive-svn-prov"
DESCRIPTION = "This package includes the documentation for texlive-svn-prov"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1862svn64967"

RPM_NAME = "texlive-svn-prov-doc-2023.209.3.1862svn64967-58.1.noarch.rpm"
RPM_HASH = "bfae081038393a7e5754f7577c4a2a920fa34b4fb09af8f0e7c535f43c7ece9f98b2acc5fb3fa61e9ab5827a3b32d89d2c9111e62b92bc54342fb02b719acbdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svn-prov-doc"

RDEPENDS:${PN} += ""

inherit rpm
