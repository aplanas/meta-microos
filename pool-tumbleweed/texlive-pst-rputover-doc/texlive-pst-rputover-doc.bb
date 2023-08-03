SUMMARY = "Documentation for texlive-pst-rputover"
DESCRIPTION = "This package includes the documentation for texlive-pst-rputover"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44724"

RPM_NAME = "texlive-pst-rputover-doc-2023.209.1.0svn44724-54.1.noarch.rpm"
RPM_HASH = "2bace9297a589f005517f4663d1096488a91b8ef10fb132b7afd4632e268717c925c883d81de2eb5e04ff22164e571d7517006602a117b1e7a8e021bdfc67cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-rputover-doc"

RDEPENDS:${PN} += ""

inherit rpm
