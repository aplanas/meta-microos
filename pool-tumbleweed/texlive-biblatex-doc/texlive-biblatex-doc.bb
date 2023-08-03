SUMMARY = "Documentation for texlive-biblatex"
DESCRIPTION = "This package includes the documentation for texlive-biblatex"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.19svn66403"

RPM_NAME = "texlive-biblatex-doc-2023.209.3.19svn66403-54.1.noarch.rpm"
RPM_HASH = "f1b739cdc76d1a202c2c0053eba0ac1242c7c495b54332f2d43a27cb2c21c2fd7f2b3acec09de70ef05a8272904a3c47d8607b8e46ca55ea840bb8853a5452fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-doc-en \
texlive-biblatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
