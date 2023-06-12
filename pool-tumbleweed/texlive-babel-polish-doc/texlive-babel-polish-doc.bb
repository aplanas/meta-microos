SUMMARY = "Documentation for texlive-babel-polish"
DESCRIPTION = "This package includes the documentation for texlive-babel-polish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62680"

RPM_NAME = "texlive-babel-polish-doc-2023.201.1.3svn62680-53.1.noarch.rpm"
RPM_HASH = "ce42d0dc39fcc20c805e17b84c8f711a84b9e32500d5b8eb36ab35b1eb73bb451d9c6854bf8649026692879378c307f65efa9f82159da1e9263f0802cae5e13c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-polish-doc"
RDEPENDS:${PN} += ""

inherit rpm
