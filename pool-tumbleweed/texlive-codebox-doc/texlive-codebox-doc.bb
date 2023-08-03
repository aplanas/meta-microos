SUMMARY = "Documentation for texlive-codebox"
DESCRIPTION = "This package includes the documentation for texlive-codebox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.4svn61771"

RPM_NAME = "texlive-codebox-doc-2023.209.1.0.4svn61771-54.1.noarch.rpm"
RPM_HASH = "2c15e96aa2b00c29c95cae6ed8436210ba164ba7c48927b39bc8ae306262c3a8a2942fb81680e1904b55a042dfe27125ba3f9d210fe566a3015e617ccfc2ab19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-codebox-doc-zh \
texlive-codebox-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3"

inherit rpm
