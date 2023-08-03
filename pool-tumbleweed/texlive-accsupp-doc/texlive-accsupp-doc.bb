SUMMARY = "Documentation for texlive-accsupp"
DESCRIPTION = "This package includes the documentation for texlive-accsupp"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn53052"

RPM_NAME = "texlive-accsupp-doc-2023.209.0.0.6svn53052-55.1.noarch.rpm"
RPM_HASH = "b0042b92cd147471595e15ea0a0b81e1fbb91e552f187b0f0a49a4cd79c61dcb3c3dd08a7f8865f559ac0bc2815f81cc7c14921f4d08585f3c8aa4b89e514bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-accsupp-doc"

RDEPENDS:${PN} += ""

inherit rpm
