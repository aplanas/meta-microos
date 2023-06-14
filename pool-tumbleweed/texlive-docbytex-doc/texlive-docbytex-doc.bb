SUMMARY = "Documentation for texlive-docbytex"
DESCRIPTION = "This package includes the documentation for texlive-docbytex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn34294"

RPM_NAME = "texlive-docbytex-doc-2023.201.svn34294-52.1.noarch.rpm"
RPM_HASH = "3ed22276b7043b6f2eff3895b49fa3e8a9af47045a4f1906f141875a21351840cf6b1117f3ba6db5a4197259a89720ff4db2e0e16511648b8d7326879213ced5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-docbytex-doc-cs \
texlive-docbytex-doc"

RDEPENDS:${PN} += ""

inherit rpm
