SUMMARY = "Documentation for texlive-yagusylo"
DESCRIPTION = "This package includes the documentation for texlive-yagusylo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn29803"

RPM_NAME = "texlive-yagusylo-doc-2023.209.1.2svn29803-53.2.noarch.rpm"
RPM_HASH = "72a4749144fd5c2ad07f6673d5b5f31ffeda9604d93a786c4f1e2885698e18e401c4be93c0e169d89bf435188679ad911b42d47ec7a5f9e86da3335eed1bfe66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yagusylo-doc-fr;en \
texlive-yagusylo-doc"

RDEPENDS:${PN} += ""

inherit rpm
