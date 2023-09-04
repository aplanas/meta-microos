SUMMARY = "Documentation for texlive-ribbonproofs"
DESCRIPTION = "This package includes the documentation for texlive-ribbonproofs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn31137"

RPM_NAME = "texlive-ribbonproofs-doc-2023.209.1.0svn31137-54.2.noarch.rpm"
RPM_HASH = "54de1ae7222b714779f339a47fe2023ed4199fa15e6816cb24925eb41c1f2e5d7e4452bbfc20987742c0425b511560ff6a7e2dabdc46ec9a1fda18d8fbb716bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ribbonproofs-doc"

RDEPENDS:${PN} += ""

inherit rpm
