SUMMARY = "Documentation for texlive-hobete"
DESCRIPTION = "This package includes the documentation for texlive-hobete"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn27036"

RPM_NAME = "texlive-hobete-doc-2023.209.svn27036-54.1.noarch.rpm"
RPM_HASH = "16fcc7df758315b61a66124bd9d93105b339257bfc2f4d8a73bf434a6caa67eea1088fb568b122d86bcbfe7b37eb0025f953f063735b006d5b8da48783a9a653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hobete-doc-de \
texlive-hobete-doc"

RDEPENDS:${PN} += ""

inherit rpm
