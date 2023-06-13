SUMMARY = "Documentation for texlive-musical"
DESCRIPTION = "This package includes the documentation for texlive-musical"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn54758"

RPM_NAME = "texlive-musical-doc-2023.201.3.1svn54758-54.1.noarch.rpm"
RPM_HASH = "6fce5f596e04814f37814583f7bd252d15efaaa59bc210dd2f132d0a7cf442b2a21c4740348bbd5512d8d3304578a5cc7b5431b0e553a3fe42410d2e5d0f40ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musical-doc"

RDEPENDS:${PN} += ""

inherit rpm
