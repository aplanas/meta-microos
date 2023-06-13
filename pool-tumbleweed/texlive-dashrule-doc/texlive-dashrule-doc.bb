SUMMARY = "Documentation for texlive-dashrule"
DESCRIPTION = "This package includes the documentation for texlive-dashrule"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.3svn29579"

RPM_NAME = "texlive-dashrule-doc-2023.204.1.3svn29579-54.1.noarch.rpm"
RPM_HASH = "3cafb3554e66f0deab73fb8f030b665c66d6c70b388cdc969da25ad70b35b2d00a5b5e1dff3c61e89bd57f521c7671027f86234992d200ab32613e67b909f884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dashrule-doc"

RDEPENDS:${PN} += ""

inherit rpm
