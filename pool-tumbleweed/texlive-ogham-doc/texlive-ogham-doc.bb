SUMMARY = "Documentation for texlive-ogham"
DESCRIPTION = "This package includes the documentation for texlive-ogham"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn24876"

RPM_NAME = "texlive-ogham-doc-2023.209.svn24876-55.1.noarch.rpm"
RPM_HASH = "ec4adff9294acf8eadd2b57b7b93199334d6b8f15bf26c3273a991b8d5c127715a53936e1b41b1cbb9d577e3111f2e50882019fb339670c473fba0fc2e86b335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ogham-doc"

RDEPENDS:${PN} += ""

inherit rpm
