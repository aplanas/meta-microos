SUMMARY = "Documentation for texlive-hobete"
DESCRIPTION = "This package includes the documentation for texlive-hobete"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn27036"

RPM_NAME = "texlive-hobete-doc-2023.209.svn27036-54.2.noarch.rpm"
RPM_HASH = "a670b4ac08092949e25bc65c3e5304401192374c3dca215f56f6c8dec97cdad059417b465694d2e456cc4d5d2fc651bc6e6422d9de9d32e9434eb9b47c5b2ddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hobete-doc-de \
texlive-hobete-doc"

RDEPENDS:${PN} += ""

inherit rpm
