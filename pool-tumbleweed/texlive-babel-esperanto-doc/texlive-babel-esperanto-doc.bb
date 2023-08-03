SUMMARY = "Documentation for texlive-babel-esperanto"
DESCRIPTION = "This package includes the documentation for texlive-babel-esperanto"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4tsvn30265"

RPM_NAME = "texlive-babel-esperanto-doc-2023.209.1.4tsvn30265-54.1.noarch.rpm"
RPM_HASH = "5fc7159bee1df94ed5a1d16ddf6ff1ff928e143502514143b21a6f383bccd4e0ae61439dd0cb8762625941cb958c3dd6c1a8bcb1d5f8ec5da0be850ff3cc929c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-esperanto-doc"

RDEPENDS:${PN} += ""

inherit rpm
