SUMMARY = "Documentation for texlive-hobby"
DESCRIPTION = "This package includes the documentation for texlive-hobby"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn44474"

RPM_NAME = "texlive-hobby-doc-2023.209.1.8svn44474-54.1.noarch.rpm"
RPM_HASH = "5c9f5f58f8579f9d5c9db9948886dcbe0f82935c13078f8b9bb1a49679d019b54329b7b1d7a880ca2d15e2b6dbc387c393b19df0d2dd4faebe5f75110715f1f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hobby-doc"

RDEPENDS:${PN} += ""

inherit rpm
