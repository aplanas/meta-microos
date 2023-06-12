SUMMARY = "Documentation for texlive-lyluatex"
DESCRIPTION = "This package includes the documentation for texlive-lyluatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.3svn66278"

RPM_NAME = "texlive-lyluatex-doc-2023.201.1.1.3svn66278-52.1.noarch.rpm"
RPM_HASH = "bfa2e2aaf515ffe8fb378046b18bd5c26937e7aee1fd4649725812331bdd0c6aa4420479a5250b3ed6307595f6eb0ef208f456bf5a83fb477fa0b3d390acba99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lyluatex-doc"
RDEPENDS:${PN} += ""

inherit rpm
