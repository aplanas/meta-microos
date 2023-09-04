SUMMARY = "Documentation for texlive-embedfile"
DESCRIPTION = "This package includes the documentation for texlive-embedfile"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.12svn65528"

RPM_NAME = "texlive-embedfile-doc-2023.209.2.12svn65528-54.2.noarch.rpm"
RPM_HASH = "3b9379fd696aea10257f920df3d62c39c4c2bb02e3ab1a7a342b4ad4f75369b71929a3b0230953cd3529eb02eeaf174bae5d3db1c9dc21399ce350924ce4bfc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embedfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
